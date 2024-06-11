// Recoil 상태를 공유하기 위해 컴포넌트들은 RecoilRoot 하위에 위치해야 한다.
import React from 'react';
import { RecoilRoot } from 'recoil';
import { TextInput } from './';

function App() {
  return (
    <RecoilRoot>
      <TextInput />
    </RecoilRoot>  
  );
}

// Atom은 상태의 일부를 나타내며 어떤 컴포넌트에서든 읽고 쓸 수 있도록 제공된다.
import { atom } from 'recoil';

export const textState = atom({
  key: 'textState', // unique ID (with respect to other atoms/selectors)
  default: '', // default value(aka initial value)
});

// useRecoilState 훅에 atom인 textState를 넘겨주면, atom에 설정한 상태를 가져다 사용할 수있고, 업데이트 또한 가능하다.
import { useRecoilState } from 'recoil';
import { textState } from './';

export function TextInput() {
  const [text, setText] = useRecoilState(textState);
  
  const onChange = (event) => {
    setText(event.target.value);
  }
  
  return (
    <div>
      <input type='text' value={text} onChange={onChange} />
      <br />
      Echo: {text}
     </div>
  );
}

setInterval(() => {
  myCart.increase();
}, 1000);
