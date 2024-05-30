// 원시 타입을 추론할 때: type 연산자 활용하기
const replaceHHyphen: (date: string | Date) => string | Date = (date) => {
  if (typeof date === "string") {
    return date.replace(/-/g, '/');
  }
  return date;
}

// 인스턴스화된 객체 타입을 판별할 때: instnaceof 연산자 활용하기
interface Range {
  start: Date;
  end: Date;
}

// Date 타입이면 Range 타입으로 변경해주는 함수이다.
// 매개변수가 Date 객체를 프로토타입 체인 상에 가지고 있는지 여부를 통해 로직을 수행한다.
export function convertToRange(selected?: Date | Range): Range | undefined {
  return selected instanceof Date ? {start: selected, end: selected} : selected;
}

// 객체의 속성이 있는 없는지에 따른 구분: in 연산자 활용하기
interface BasicNoticeDialogProps {
  noticeTitle: string;
  noticeBody: string;
}

interface NoticeDialogWithCookieProps extends BasicNoticeDialogProps {
  cookieKey: string;
  noForADay?: boolean;
  neverAgain?: boolean;
}

export type NoticeDialogProps = BasicNoticeDialogProps | NoticeDialogWithCookieProps;

const NoticeDialog: React.FC<NoticeDialogProps> = (props) => {
  if('cookieKey' in props) return <NoticeDialogWithCookie {...props} />;
  return <NoticeDialogBase {...props} />;
}

// is 연산자로 사용자 정의 타입 가드 만들어 활용하기
function isString(value: unknown) value is string {
  return typeof value === 'string';
}

function logValueIfExists(value: string | null | undefined) {
  if(isString(value)) {
 	// ✅ OK
    value.toString();    
  }else {
    console.log(`Value does not exist: ${value}`);
  }
}

// 에러 정의 - 타입스크립트에서는 별도의 타입 에러를 뱉지 않아 알 수 없다는 문제점이 있다.
type TextError = {
  errorCode: string;
  errorMessage: string;
}

type ToastError = {
  errorCode: string;
  errorMessage: string;
  toastShowDuration: number;
}

type AlertError = {
  errorCode: string;
  errorMessage: string;
  onConfirm: () => void;
}

type ErrorFeedbackType = TextError | ToastError | AlertError;

// 식별할 수 있는 유니온(Discriminated Unions)
type TextError = {
  errorType: 'TEXT',
  errorCode: string;
  errorMessage: string;
}

type ToastError = {
  errorType: 'TOAST',
  errorCode: string;
  errorMessage: string;
  toastShowDuration: number;
}

type AlertError = {
  errorType: 'ALERT',
  errorCode: string;
  errorMessage: string;
  onConfirm: () => void;
}

type ErrorFeedbackType = TextError | ToastError | AlertError;

const errorArr: ErrorFeedbackType[] = [
  {
    errorType: 'TEXT', 
    errorCode: '100', 
    errorMessage: '텍스트 에러'
  },
  {
    errorType: 'TOAST', 
    errorCode: '100', 
    errorMessage: '토스트 에러', 
    toastShowDuration: 3000
  },
  {
    errorType: 'ALERT', 
    errorCode: '100', 
    errorMessage: '얼럿 에러', 
    onConfirm: () => {}
  }
];

// Exhaustiveness Checking 예시
type ProductPrice = '10000' | '20000' | '5000';

const getProductName = (productPrice: ProductPrice): string => {
  if(productPrice === '10000') return '배민상품권 1만원';
  if(productPrice === '20000') return '배민상품권 2만원';
  // if(ProductPrice === '5000') return '배민상품권 5천원';
  else {
    exhaustiveCheck(productPrice);
    return '배민상품권';
  } 
}

const exhaustiveCheck  = (param: never) => {
  throw new Error('type error.');
}
