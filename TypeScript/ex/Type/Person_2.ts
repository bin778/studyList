// 타입스크립트에서 typeof, instanceof 그리고 타입 단언을 사용해서 확인할 수 있다.
// typeof는 연산하기 전에 피연산자의 데이터 타입을 나타내는 문자열을 반환한다.
// typeof는 7가지 데이터 타입(Boolean, null, undefined, Number, BigInt, String, Symbol)과 함수(Function), 호스트 객체 그리고 object 객체가 될 수 있다.
interface Person {
  first: string;
  last: string;
}

const person: Person = {first: "zig", last: "zag"};
function email(options: {person: Person; subject: string; body: string}) {}

console.log(typeof 2022);
console.log(typeof "uri");
console.log(typeof true);
console.log(typeof undefined);
console.log(typeof {});

console.log(typeof person);
console.log(typeof email);
