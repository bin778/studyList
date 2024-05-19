const num = 123;
const str = "abc";

function func(n) {
  return n * 2;
}

console.log(func(num));
// 자바스크립트는 타입이 달라도 NaN으로 처리된다.
console.log(func(str));
