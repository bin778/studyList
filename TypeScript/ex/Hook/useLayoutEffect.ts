// useEffect와 타입 정의가 동일하다
function useLayoutEffect(effect: EffectCallback, deps?: DependencyList): void;

type DependencyList = ReadonlyArray<any>;
type EffectCallback = () => void | Destructor;

useEffect(() => {
  // 매우 긴 시간이 흐른 뒤 아래 setName()을 실행한다고 가정
  setName("배달이");
}, []);

return <div>{`안녕하세요, ${name}님!`}</div>;

// 만일 위처럼 useEffect를 이용한다면 name이 빈칸으로 렌더링되다가 오랜 시간 이후에 "배달이"가 렌더링될 것이다. 사용자는 빈 이름을 오랫동안 보게 된다.
useLayoutEffect(() => {
  // 매우 긴 시간이 흐른 뒤 아래 setName()을 실행한다고 가정
  setName("배달이");
}, []);

return <div>{`안녕하세요, ${name}님!`}</div>;
