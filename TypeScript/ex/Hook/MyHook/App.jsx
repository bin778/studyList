import useInput from "./hooks/useInput";

function App() {
  const { value, onChange } = useInput("");
  return (
    <>
      <h1>{value}</h1>
      <input onChange={onChange} value={value} />
    </>
  );
}

export default App;
