// styled-components 테마 정리
export const theme = {
  fontSize: {
    default: "16px",
    small: "14px",
    large: "18px",
  },
  color: {
    white: "#FFFFFF",
    black: "#000000",
  },
};

type Theme = typeof theme;
export type FontSize = keyof Theme["fontSize"];
export type Color = keyof Theme["color"];
// styled-components: 커스텀 select 정의
interface SelectStyleProps {
  color: Color;
  fontSize: FontSize;
}

const StyledSelect = styled.select<SelectStyleProps>`
  color: ${({ color }) => theme.color[color]};
  fontsize: ${({ fontSize }) => theme.fontSize[fontSize]};
`;

// Select 컴포넌트 정의
type ReactSelectProps = React.ComponentPropsWithoutRef<"select">;
interface SelectProps<OptionType extends Record<string, string>>
  extends Partial<SelectStyleProps> {
  id?: ReactSelectProps["id"];
  className?: ReactSelectProps["className"];
  options: OptionType;
  selectedOption?: keyof OptionType;
  onChange?: (selected?: keyof OptionType) => void;
}

export const Select = <OptionType extends Record<string, string>>({
  className,
  id,
  options,
  onChange,
  selectedOption,
  fontSize = "default",
  color = "black",
}: SelectProps<OptionType>) => {
  const handleChange: React.ChangeEventHandler<HTMLSelectElement> = (e) => {
    const selected = Object.entries(options).find(
      ([, value]) => value === e.target.value,
    )?.[0];
    onChange?.(selected);
  };

  return (
    <StyledSelect
      id={id}
      className={className}
      fontSize={fontSize}
      color={color}
      onChange={handleChange}
      value={selectedOption && options[selectedOption]}
    >
      {Object.entries(options).map(([key, value]) => (
        <option key={key} value={value}>
          {value}
        </option>
      ))}
    </StyledSelect>
  );
};
const fruits = {
  apple: "사과",
  banana: "바나나",
  blueberry: "블루베리",
};
type Fruit = keyof typeof fruits;

export const FruitSelect = () => {
  const [fruit, changeFruit] = useState<Fruit | undefined>();

  return (
    <Select
      className="fruitSelectBox"
      options={fruits}
      onChange={changeFruit}
      selectedOption={fruit}
      fontSize="large"
    />
  );
};
