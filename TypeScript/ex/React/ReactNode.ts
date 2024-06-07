// React.ReactNode 타입
type ReactText = string | number;
type ReactChild = ReactElement | ReactText;
type ReactFragment = {} | Iterable<ReactNode>;

/**
 * 책엔 아래와 같이 정의되어 있지만, 실제 ReactNode 타입 정의 내용도 조금 변경되었다.
 */
type ReactNode =
  | ReactChild
  | ReactFragment
  | ReactPortal
  | boolean
  | null
  | undefined

// 사용 예시
type PropsWithChildren<P = unknown> = P & { children?: ReactNode | undefined; }; 

interface MyProps { /* ... */ }
type MyComponentProps = PropsWithChildren<MyProps>;
