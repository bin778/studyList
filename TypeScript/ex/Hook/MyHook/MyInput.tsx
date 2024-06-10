import { useState, useCallback } from "react";

const useInput = (initialValue) => {
  const [value, setValue] = useState(initialValue); // 인자로 받은 값을 초기값으로 지정하여 관리
  const onChange = useCallback((e) => {
    setValue(e.target.value);
  }, []);
  // input의 값 value와
  // 해당 값을 수정할 수 있는 함수 onChange를 반환하는 훅
  return { value, onChange };
};

export default useInput;
