// React Element 타입
interface ReactElement<
  P = any,
  T extends string | JSXElementConstructor<any> = string | JSXElementConstructor<any>,
> {
  type: T;
  props: P;
  key: string | null;
}

// 사용 예시
interface IconProps {
  size: number;
}

interface Props {
  icon: React.ReactElement<IconProps>;
}

const Item = ({icon}: Props) => {
  // icon prop으로 받은 컴포넌트의 컴포넌트의 props에 접근하면, props의 목록이 추론된다.
  const iconSize = icon.props.size;
  return <li>{icon}</li>
}
