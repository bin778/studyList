// 클래스 컴포넌트 타입
interface Component<P = {}, S = {}, SS = any> extends ComponentLifecycle<P, S, SS> {}

class Component<P, S> { /* 내용 생략*/}

class PureComponent<P = {}, S = {}, SS = any> extends Component<P, S, SS> {}

// 함수 컴포넌트 타입
interface WelcomeProps {
  name: string;
}

// 함수 선언을 사용한 방식
function Welcome(props: WelcomeProps): JSX.Element {}

// 함수 표현식을 사용한 방식
// React.FC 사용
const Welcome:React.FC<WelcomeProps> = ({ name }) => {};

// React.VFC 사용 → v18부터 deprecated됨
const Welcome:React.VFC<WelcomeProps> = ({ name }) => {};

// Props 타입과 return 타입을 직접 입력하여 사용
const Welcome = ({ name }: WelcomeProps): JSX.Element => {};
