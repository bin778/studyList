// 집합으로 나타낼수 있는 타입스크립트의 타입 시스템을 지탱하고 있는 개념이 바로 구조적 서브타이핑(Structural Subtyping)이다.
// 구조적 서브타이핑이란 객체가 가지고 있는 속성을 바탕으로 타입을 구분하는 것이다.
interface Pet {
  name: String;
}

interface Cat {
  name: String;
  age: number;
}

let pet: Pet;
let cat: Cat = { name: "Zag", age: 2 };
pet = cat;
