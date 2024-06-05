// 타입 가드 활용하기
interface ErrorResponse {
  status: string;
  serverDateTime: string;
  errorCode: string;
  errorMessage: string;
}

function isServerError(error: unknown): error is AxiosError<ErrorResponse> {
  return axios.isAxiosError(error);
}

// 서버 에러임을 명시적으로 알 수 있음
const onClickDeleteHistoryButton = async (id: string) => {
  try {
    await axios.post("https://....", { id });

    alert("주문 내역이 삭제되었습니다.");
  } catch (error: unknown) {
    if (isServerError(e) && e.response && e.response.data.errorMessage) {
      // 서버 에러일 때의 처리임을 명시적으로 알 수 있다 setErrorMessage(e.response.data.errorMessage);
      return;
    }
    setErrorMessage("일시적인 에러가 발생했습니다. 잠시 후 다시 시도해주세요");
  }
};

// 에러 서브클래싱하기
class OrderHttpError extends Error {
  private readonly privateResponse: AxiosResponse<ErrorResponse> | undefined;

  constructor(message?: string, response?: AxiosResponse<ErrorResponse>) {
    super(message);
    this.name = "OrderHttpError";
    this.privateResponse = response;
  }

  get response(): AxiosResponse<ErrorResponse> | undefined {
    return this.privateResponse;
  }
}

class NetworkError extends Error {
  constructor(message = "") {
    super(message);
    this.name = "NetworkError";
  }
}

class UnauthorizedError extends Error {
  constructor(message: string, response?: AxiosResponse<ErrorResponse>) {
    super(message, response);
    this.name = "UnauthorizedError";
  }
}

// 인터셉터를 활용한 에러 처리
const httpErrorHandler = (
  error: AxiosError<ErrorResponse> | Error
): Promise<Error> => {
  (error) => {
    // 401 에러인 경우 로그인 페이지로 이동
    if (error.response && error.response.status === 401) {
      window.location.href = `${backOfficeAuthHost}/login?targetUrl=${window.location.href}`;
    }
    return Promise.reject(error);
  };
};

orderApiRequester.interceptors.response.use(
  (response: AxiosResponse) => response,
  httpErrorHandler
);

// 에러 바운더리를 활용한 에러 처리
import React, { ErrorInfo } from "react";
import ErrorPage from "pages/ErrorPage";

interface ErrorBoundaryProps {}

interface ErrorBoundaryState {
  hasError: boolean;
}

class ErrorBoundary extends React.Component<
  ErrorBoundaryProps,
  ErrorBoundaryState
> {
  constructor(props: ErrorBoundaryProps) {
    super(props);
    this.state = { hasError: false };
  }

  static getDerivedStateFromError(): ErrorBoundaryState {
    return { hasError: true };
  }

  componentDidCatch(error: Error, errorInfo: ErrorInfo): void {
    this.setState({ hasError: true });

    console.error(error, errorInfo);
  }

  render(): React.ReactNode {
    const { children } = this.props;
    const { hasError } = this.state;

    return hasError ? <ErrorPage /> : children;
  }
}

const App = () => {
  return (
    <ErrorBoundary>
      <OrderHistoryPage />
    </ErrorBoundary>
  );
};

// react-query를 활용한 에러 처리
const JobComponent: React.FC = () => {
  const { isError, error, isLoading, data } = useFetchJobList();
  if (isError) {
    return (
      <div>{`${error.message}가 발생했습니다. 나중에 다시 시도해주세요.`}</div>
    );
  }
  if (isLoading) {
    return <div>로딩 중입니다.</div>;
  }
  return (
    <>
      {data.map((job) => (
        <JobItem key={job.id} job={job} />
      ))}
    </>
  );
};
