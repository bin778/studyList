// (1) 제네릭으로 HTMLInputElement | null 사용시 아래 타입 반환
function useRef<T>(initialValue: T): MutableRefObject<T>;
// (2) 제네릭으로 HTMLInputElement, 인자로 null 사용시 아래 타입 반환
function useRef<T>(initialValue: T | null): RefObject<T>;
// (3) 초기값 없이 useRef 사용시 아래 타입 반환
function useRef<T = undefined>(): MutableRefObject<T | undefined>;

interface MutableRefObject<T> {
  current: T; // current값 변경 가능
}

interface RefObject<T> {
  readonly current: T | null; // readonly로 인해 current값 변경 불가능
}

import { forwardRef, useRef } from "react";

const Component = () => {
  const ref = useRef<HTMLInputElement>(null);
  return <MyInput ref={ref} name="inputname" />; // 아래 Props에서 정의한 필수 속성 name
};

// 꼭 받을 속성을 추가로 정의하기 위한 타입 정의
interface Props {
  name: string;
}

const MyInput = forwardRef<HTMLInputElement, Props>((props, ref) => {
  // forwardRef의 두 번째 인자에 ref를 넣어 자식 컴포넌트로 ref를 전달
  // forwardRef의 타입 정의로 인해 부모 컴포넌트에서 ref를 어떻게 선언했는지와 관계없이 자식 컴포너트가 해당 ref를 수용할 수 있다.
  return (
    <div>
      <label>{props.name}</label>
      <input ref={ref} />
    </div>
  );
});
