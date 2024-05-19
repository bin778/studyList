const num: number = 123;
const str: string = "abc";

function func(n: number) {
  return n * 2;
}

console.log(func(num));
// 타입스크립트는 타입이 다르면 매개변수에 전달할 수 없다.
// console.log(func(str));
