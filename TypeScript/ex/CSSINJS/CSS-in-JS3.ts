// 유틸리티 함수를 사용하면 props의 중복 선언 문제를 방지할 수 있다.
interface Props {
  height?: string;
  color?: keyof typeof colors;
  isFull?: boolean;
  className?: string;
  ...
}
  
export const Hr: VFC<Props> = ({
  height,
  color,
  isFull,
  className
}) => {
  ...
  return (
    <HrComponent
    	height={height}
		color={color}
		isFull={isFull}
		className={className}
	/>
  )
};

const StyledProps {
  height?: string;
  color?: keyof typeof colors;
  isFull?: boolean;
};

//일반적인 컴포넌트 사용법
const HrComponent = styled.hr<StyledProps>`
	height: ${{ height }} => height || "10px"};
	margin:0;
	background-color: ${{ color }} => colors[color || "gray7"]};
	${({ isFull }) => isFull && 
      css`
		margin: 0 -15px;
	`}
`

//유틸리티 타입 사용법
const HrComponent = styled.hr<Pick<Props, "height" | "color" | "isFull">>`
	height: ${{ height }} => height || "10px"};
	margin:0;
	background-color: ${{ color }} => colors[color || "gray7"]};
	${({ isFull }) => isFull && 
      css`
		margin: 0 -15px;
	`}
`
