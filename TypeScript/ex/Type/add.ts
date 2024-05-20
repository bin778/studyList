// 타입스크립트는 점직적으로 타입을 확인하기 때문에 타입 선언을 생략하면 암시적 타입 변환이 일어난다.
function add(x: any, y: any, z: any) {
  return x + y + z;
}

console.log(add(10, 20, "Hello"));
console.log(add("Hello", 10, 20));
