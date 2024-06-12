// 인라인 스타일
const textStyles = {
  color: white;
  backgroundColor: black;
}
const SomeComponent = () => {
  return (
    <p style={textStyles}>inline style</p>
  )
}

//위 코드의 결과
<p style="color:white; background-color:black;">inline style</p>

// CSS-in-JS 방식
import styled from 'styled-components';
const Text = styled.div`
  color: white,
  background: black
`
const Example = () => <Text>hello</Text>

//위 코드의 결과
<style>
  .hash136s21 {
    background-color: black;
    color:white;
  }
</style>

<p class="hash136s21">hello</p>
