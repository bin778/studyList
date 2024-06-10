// after
import { ChangeEvent, useCallback, useState } from "react";

const useInput = (initialValue: string) => {
  // 인자 타입 추가
  const [value, setValue] = useState(initialValue);
  const onChange = useCallback((e: ChangeEvent<HTMLInputElement>) => {
    // 이벤트 타입 추가
    setValue(e.target.value);
  }, []);
  return { value, onChange };
};

export default useInput;
