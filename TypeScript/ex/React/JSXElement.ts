// JSX.Element 타입
declare global {
  namespace JSX {
    interface Element extends React.ReactElement<any, any> {}
  }
}

interface Props {
  icon: JSX.Element;
}

// 사용 예시
const Item = ({ icon }: Props) => {
  // prop으로 받은 컴포넌트의 props에 접근할 수 있다.
  const iconSize = icon.props.size;
  return <li>{icon}</li>;
}

// icon prop에는 JSX.Element 타입을 가진 요소만 할당할 수 있다.
const App = () => {
  return <Item icon={ <Icon size={14}/> } />
}
