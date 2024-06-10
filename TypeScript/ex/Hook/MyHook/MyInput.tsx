import { useState, useCallback } from "react";

const useInput = (initialValue) => {
  // 🚨 ERROR : Parameter 'initialValue' implicitly has an 'any' type.
  const [value, setValue] = useState(initialValue);
  const onChange = useCallback((e) => {
    // 🚨 ERROR : Parameter 'e' implicitly has an 'any' type.
    setValue(e.target.value);
  }, []);
  return { value, onChange };
};

export default useInput;
