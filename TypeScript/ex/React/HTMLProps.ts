// DetailedHTMLProps 활용 방법
type NativeButtonProps = React.DetailedHTMLProps<
  React.ButtonHTMLAttributes<HTMLButtonElement>,
  HTMLButtonElement
>;

type ButtonProps = {
  onClick?: NativeButtonProps['onClick'];
};

// ComponentPropsWithoutRef 활용 방법
type NativeButtonType = React.ComponentPropsWithoutRef<'button'>;
type ButtonProps = {
  onClick?: NativeButtonType['onClick'];
};

type NativeButtonProps = React.DetailedHTMLProps<
  React.ButtonHTMLAttributes<HTMLButtonElement>,
  HTMLButtonElement
>;

const Button = (props: NativeButtonProps) => {
  return <button {...props}>버튼 </button>
};
