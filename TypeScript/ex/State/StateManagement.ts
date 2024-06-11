// 시간이 지나도 변하지 않는 값이라면 객체 참조 동일성을 유지하는 방법을 고려해볼 수 있다.
// 메모이제이션을 이용하기 위해 useMemo 훅을 활용하는 방법이 있다.
const store = useMemo(() => new Store(), []);

// useState를 사용하여 초깃값을 지정하면 참조값이 변경되는 것을 피할 수 있다.
const [store] = useState(() => new Store());

// useRef가 동일한 객체 참조를 유지하려는 목적으로 사용하기에 가장 적합한 훅이며, 실제로도 권장되는 방법이다.
const store = useRef<Store>(null);
if(!store.current) store.current = new Store();

// 파생된 값은 상태가 아니다.
// 부모가 내려준 initialEmail을 자식 컴포넌트의 email에 초기화하여 사용하는 것은 같은 데이터의 출처를 분리하여 이중으로 관리하는 행위이다. 
// 중간에 initialEmail이 변경되어도 useState는 마운트 될 때 한 번만 email 상태의 값을 설정하기 때문에 전달 받은 initialEmail의 값이 변경되어도 input 태그의 value는 변경이 일어나지 않는다. 
import { useState } from 'react';

type UserEmailProps = {
  initialEmail: string;
}

const UserEmail: React.FC<UserEmailProps> = ({ initialEmail }) => {
  const [email, setEmail] = useState(initialEmail);
  
  const onChangeEmail = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEmail(e.target.value;
  };
  
  return (
    <div>
      <input type='text' value={email} onChange={onChangeEmail} />
    </div>
  );
};

// UserEmail에서 관리하던 상태를 부모 컴포넌트로 옮겨서 email 데이터의 출처를 props 하나로 통일할 수 있다.
import { useState } from 'react';

type UserEmailProps = {
  initialEmail: string;
}

const UserEmail: React.FC<UserEmailProps> = ({ email, setEmail }) => {
  const onChangeEmail = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEmail(e.target.value;
  };
  
  return (
    <div>
      <input type='text' value={email} onChange={onChangeEmail} />
    </div>
  );
};

// 기존 상태에서 계산될 수 있는 값을 사용할 때의 문제점
//selectedItems는 items에서 파생된 데이터로 두 데이터가 동기화 되지 않을 수 있다는 점이 문제이다.
// 아직은 간단한 로직이라 괜찮지만, 여러 상태가 복잡하게 얽혀있다면 흐름을 파악하기 어렵고 의도치 않게 동기화 과정이 누락될 수도 있다.
const [items, setItems] = useState<Item[]>([]);
const [selectedItems, setSelectedItems] = useState<Item[]>([]);

useEffect(() => {
  setSelectedItems(items.filter((item) => item.isSelected));
}, [items]);

// 이 문제를 해결하기 위한 방법으로는 상태로 정의하지 않고, JS 변수로 담는 것이다. 
// 다만 이 경우에는 매번 렌더링될 때마다 계산을 수행하게 되므로 계산 비용이 크다면 성능 문제가 발생할 수 있다. 
// 이럴 때 useMemo를 사용하여 items가 변경될 때만 계산을 수행하고 결과를 메모이제이션하여 성능을 개선할 수 있다.
const [items, setItems] = useState<Item[]>([]);
const selectedItems = useMemo(() => veryExpensiveCalculation(items), [items]);
