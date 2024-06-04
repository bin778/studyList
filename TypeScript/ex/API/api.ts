// fetch로 API 요청하기
import React, { useEffect, useState } from "react";

const CartBadge: React.FC = () => {
  const [cartCount, setCartCount] = useState(0);

  useEffect(() => {
    fetch("https://api.baemin.com/cart")
      .then((response) => response.json())
      .then(({ cartItem }) => {
        setCartCount(cartItem.length);
      });
  }, []);

  return <>{/*  cartCount 상태를 이용하여 컴포넌트 렌더링 */}</>;
};

// 서비스 레이어로 분리하기
async function fetchCart() {
  const controller = new AbortController();

  const timeoutId = setTimeout(() => controller.abort(), 5000);

  const response = await fetch("https://api.baemin.com/cart", {
    signal: controller.signal,
  });

  clearTimeout(timeoutId);

  return response;
}

// Axios 활용하기
import axios, { AxiosInstance, AxiosPromise } from "axios";

export type FetchCartResponse = unknown;
export type PostCartRequest = unknown;
export type PostCartResponse = unknown;

export const apiRequester: AxiosInstance = axios.create({
  baseURL: "https://api.baemin.com",
  timeout: 5000,
});

export const fetchCart = (): AxiosPromise<FetchCartResponse> =>
  apiRequester.get<FetchCartResponse>("cart");

export const postCart = (
  postCartRequest: PostCartRequest
): AxiosPromise<PostCartResponse> =>
  apiRequester.post<PostCartResponse>("cart", postCartRequest);

// API Entry가 다를 경우 각 서버의 기본 URL을 호출하도록 인스턴스를 따로 구성한다.
import axios, { AxiosInstance } from "axios";

const defaultConfig = {};

const apiRequester: AxiosInstance = axios.create(defaultConfig);
const orderApiRequester: AxiosInstance = axios.create({
  baseURL: "https://api.baemin.or/",
  ...defaultConfig,
});
const orderCartApiRequester: AxiosInstance = axios.create({
  baseURL: "https://cart.baemin.order/",
  ...defaultConfig,
});

// Axios 인터셉터 사용하기
// 기본 API 클래스 : 실제 호출 부분 구성
import axios, { AxiosPromise } from "axios";

// 임시 타이핑
export type HTTPMethod = "GET" | "POST" | "PUT" | "DELETE";

export type HTTPHeaders = any;

export type HTTPParams = unknown;

//
class API {
  readonly method: HTTPMethod;

  readonly url: string;

  baseURL?: string;

  headers?: HTTPHeaders;

  params?: HTTPParams;

  data?: unknown;

  timeout?: number;

  withCredentials?: boolean;

  constructor(method: HTTPMethod, url: string) {
    this.method = method;
    this.url = url;
  }

  call<T>(): AxiosPromise<T> {
    const http = axios.create();
    // 만약 `withCredential`이 설정된 API라면 아래 같이 인터셉터를 추가하고, 아니라면 인터셉터 를 사용하지 않음
    if (this.withCredentials) {
      http.interceptors.response.use(
        (response) => response,
        (error) => {
          if (error.response && error.response.status === 401) {
            /* 에러 처리 진행 */
          }
          return Promise.reject(error);
        }
      );
    }
    return http.request({ ...this });
  }
}

export default API;

// API 호출을 위한 래퍼를 빌더 패턴으로 만들기
import API, { HTTPHeaders, HTTPMethod, HTTPParams } from "./7.1.4-2";

const apiHost = "";

class APIBuilder {
  private _instance: API;

  constructor(method: HTTPMethod, url: string, data?: unknown) {
    this._instance = new API(method, url);
    this._instance.baseURL = apiHost;
    this._instance.data = data;
    this._instance.headers = {
      "Content-Type": "application/json; charset=utf-8",
    };
    this._instance.timeout = 5000;
    this._instance.withCredentials = false;
  }

  static get = (url: string) => new APIBuilder("GET", url);

  static put = (url: string, data: unknown) => new APIBuilder("PUT", url, data);

  static post = (url: string, data: unknown) =>
    new APIBuilder("POST", url, data);

  static delete = (url: string) => new APIBuilder("DELETE", url);

  baseURL(value: string): APIBuilder {
    this._instance.baseURL = value;
    return this;
  }

  headers(value: HTTPHeaders): APIBuilder {
    this._instance.headers = value;
    return this;
  }

  timeout(value: number): APIBuilder {
    this._instance.timeout = value;
    return this;
  }

  params(value: HTTPParams): APIBuilder {
    this._instance.params = value;
    return this;
  }

  data(value: unknown): APIBuilder {
    this._instance.data = value;
    return this;
  }

  withCredentials(value: boolean): APIBuilder {
    this._instance.withCredentials = value;
    return this;
  }

  build(): API {
    return this._instance;
  }
}

export default APIBuilder;

// API 응답 타입 지정하기
import { AxiosPromise } from "axios";
import {
  FetchCartResponse,
  PostCartRequest,
  PostCartResponse,
  apiRequester,
} from "./7.1.3-1";

export interface Response<T> {
  data: T;
  status: string;
  serverDateTime: string;
  errorCode?: string; // FAIL, ERROR errorMessage?: string; // FAIL, ERROR
}
const fetchCart = (): AxiosPromise<Response<FetchCartResponse>> =>
  apiRequester.get<Response<FetchCartResponse>>("cart");

const postCart = (
  postCartRequest: PostCartRequest
): AxiosPromise<Response<PostCartResponse>> =>
  apiRequester.post<Response<PostCartResponse>>("cart", postCartRequest);

// 하나의 API 서버에서 다른 API 서버로 넘겨주기만 하는 값도 존재할 수 있다.
// 해당 값에 어떤 응답값이 들어있는지 알 수 없거나, 값의 형식이 달라지더라도 로직에 영향을 주지 않는 경우 unknown 타입을 사용하여 알 수 없는 값임을 표현한다.
interface response {
  data: {
    cartItems: CartItem[];
    forPass: unknown; // 언제든지 변경 될 수 있으므로, forPass 내의 값을 사용하지 않아야한다.
  };
}

// 뷰 모델(View Model) 사용하기
const ListPage: React.FC = () => {
const [totalItemCount, setTotalItemCount] = useState(0);
const [items, setItems] = useState<ListItem[]>([]);

useEffect(() => {
  // 예시를 위한 API 호출과 then 구문
  fetchList(filter).then(({ items }) => {
    setTotalItemCount(items.length);
    setItems(items);
  });
}, []);

return (
  <div>
    <Chip label={totalItemCount} />
    <Table items={items} />
  </div>
  );
};

// 기존에 items로 오던 필드명이 jobitems로 올 경우 컴포넌트에서는 변경이 일어날 수 밖에 없다. 이럴때 뷰 모델을 도입할 수 있다.
// 기존 ListResponse에 더 자세한 의미를 담기 위한 변화
interface JobListItemResponse {
  name: string;
}

interface JobListResponse {
  jobItems: JobListItemResponse[]; // jobItems로 서버에서 받아옴
}

class JobList {
  readonly totalItemCount: number;
  readonly items: JobListItemResponse[];
  constructor({ jobItems }: JobListResponse) {
    this.totalItemCount = jobItems.length; // 서버에서 주지 않는 새로운 값 생성
    this.items = jobItems; // items로 넘겨주고 있음
  }
}

const fetchJobList = async (
  filter?: ListFetchFilter
): Promise<JobListResponse> => {
  const { data } = await api
    .params({ ...filter })
    .get("/apis/get-list-summaries")
    .call<Response<JobListResponse>>();

  return new JobList(data);
};

// Superstruct를 사용해 런타임에서 타입 검증하기
interface ListItem {
  id: string;
  content: string;
}

interface ListResponse {
  items: ListItem[];
}
const fetchList = async (filter?: ListFetchFilter): Promise<ListResponse> => {
  const { data } = await api
    .params({ ...filter })
    .get("/apis/get-list-summaries")
    .call<Response<ListResponse>>();

  return { data };
};

// Superstruct를 활용하여 타입스크립트로 선언한 타입과 실제 런타임에서의 데이터 응답값을 매칭하여 유효성 검사를 할 수 있다.
import { assert } from "superstruct";

function isListItem(listItems: ListItem[]) {
  listItems.forEach((listItem) => assert(listItem, ListItem));
}
