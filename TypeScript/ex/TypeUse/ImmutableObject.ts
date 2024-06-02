// 불변 객체 선언
const colors = {
  red: "#F45452",
  green: "#0C952A",
  blue: "#1A7CFF",
}

const getColorHex = (key: string) => colors[key]; // (X) color에 표현하는 값이 없기 때문에 any로 반환된다.

const getColorHex = (key: keyof typeof colors) => colors[key]; // (O) colors에 존재하는 키값만 받도록 제어함으로써 getColorHex의 반환값은 string
const redHex = getColorHex("red");

// 타입스크립트 keyof 연산자로 객체의 키값을 타입으로 추출하기
interface ColorType {
  red: string;
  green: string;
  blue: string;
}

type ColorKeyType = keyof ColorType; // 'red' | 'green' | 'blue'

// 타입스크립트 typeof 연산자로 값을 타입으로 다루기
const colors = {
  red: "#F45452",
  green: "#0C952A",
  blue: "#1A7CFF",
};

type ColorsType = typeof colors;
/*
{
  red: string;
  green: string;
  blue: string;
}
*/
