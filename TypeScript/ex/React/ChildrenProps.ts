type WelcomeProps = {
  name: string;
  children: '천생연분' | '더 귀한 분' | '귀한 분' | '고마운 분';
}

type WelcomeProps = {
  name: string;
  children: string;
}

type WelcomeProps = {
  name: string;
  children: ReactElement;
}

const Welcome: React.FC<PropsWithChildren<WelcomeProps>> = ({name, chilren}) => { /* 구현부 */ };
