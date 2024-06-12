export function FlatButton({
  children,
  text = '',
  backgroundColor = COLORS.primary1,
}: FlatButtonProps) {
  return (
    <FlatButtonDiv
      color={color}
      onClick={onClick}>
      {text}
      {children}
    </FlatButtonDiv>
  )
}
interface IFlatButtonStyle {
  paddingVertical: string
  paddingHorizontal: string
  width?: string
  backgroundColor: string
}

const FlatButtonDiv = styled.div<IFlatButtonStyle>`
  cursor: pointer;
  border-radius: 100px;
  color: ${p => p.color ?? COLORS.neutrals8};
  width: ${(p) => (p.width ? p.width : 'auto')};
