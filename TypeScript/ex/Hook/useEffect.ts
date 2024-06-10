type SomeObject = {
  name: string;
  id: string;
};

interface LabelProps {
  value: SomeObject;
}

const Label: React.FC<LabelProps> = ({ value }) => {
  const { id, name } = value;
  useEffect(() => {
    /* 수행할 일 */
  }, [id, name]); // value.name과 value.id 대신 name, id 직접 사용
};
