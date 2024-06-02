// 불변 객체 예시1 - 객체 타입을 활용해서 컴포넌트 구현하기
import { FC } from "react";
import styled from "styled-components";

const colors = {
  black: "#000000",
  gray: "#222222",
  white: "#FFFFFF",
  mint: "#2AC1BC",
};

const theme = {
  colors: {
    default: colors.gray,
    ...colors,
  },

  backgroundColor: {
    default: colors.white,
    gray: colors.gray,
    mint: colors.mint,
    black: colors.black,
  },

  fontSize: {
    default: "16px",
    small: "14px",
    large: "18px",
  },
};

// 이렇게 만들어지 theme 객체의 스타일 키 값을 컴포넌트에 props 전달
interface Props {
  fontSize?: string;
  backgroundColor?: string;
  color?: string;
  onClick: (event: React.MouseEvent<HTMLButtonElement>) => void | Promise<void>;
}

const Button: FC<Props> = ({ fontSize, backgroundColor, color, children }) => {
  return (
    <ButtonWrap
      fontSize={fontSize}
      backgroundColor={backgroundColor}
      color={color}
    >
      {children}
    </ButtonWrap>
  );
};

// 컴포넌트 ButtonWrap이 props로 스타일 키 값(fontSize, backgroundColor, color)을 전달받음
const ButtonWrap = styled.button<Omit<Props, "onClick">>`
  color: ${({ color }) => theme.colors[color ?? "default"]};
  background-color: ${({ backgroundColor }) =>
    theme.bgColor[backgroundColor ?? "default"]};
  font-size: ${({ fontSize }) => theme.fontSize[fontSize ?? "default"]};
`;
