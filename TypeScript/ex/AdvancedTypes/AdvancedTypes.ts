// any 타입
let state: any;

state = { value: 0}; // 객체 할당해도
state = 100; // 숫자를 할당해도
state = "hello world"; // 문자열을 할당해도
state.foo.bar = () => console.log("this is any type"); // 심지어 중첩 구조로 들어가 함수를 할당해도 문제없다

// unknown 타입
let unknownValue: unknown;

unknownValue = 100; // any 타입과 유사하게 숫자이든
unknownValue = "hello world" // 문자열이든
unknownValue = () => console.log("this is unknown type"); // 함수이든 상관없이 할당이 가능하지만

let someValue1: any = unknownValue; // (O) any 타입으로 선언된 변수를 제외한 다른 변수는 모두 할당이 불가
// let someValue2: number = unknownValue; // (X)
// let someValue3: string = unknownValue; // (X)

// 할당하는 시점에서는 에러가 발생하지 않지만
const unknownFunction: unknown = () => console.log("this is unknown type");
// 하지만 실행 시에는 에러가 발생; Error: Object is type 'unknown'.ts (2571)
// unknownFunction();

// void 타입
let voidValue: void = undefined;
// strictNullChecks가 비활성화된 경우에 가능
// voidValue = null;

// never 타입
function generateError(res: Response): never { // 에러를 던지는 경우
  throw new Error("에러!"); 
}

function checkStatus(): never {
  while (true) { // 함수가 무한 반복되는 경우
    // ...
  }
}

// array 타입
// const array1: number[] = [1, 2, 3]; // 숫자에 해당하는 원소만 허용한다
// const array2: Array<number> = [1, 2, 3]; // number[]와 동일한 타입이다

// 두 개 이상의 타입을 동시에 관리하려면 유니온을 사용한다.
const array1: Array<number | string> = [1, "string"];
const array2: (number | string)[] = [1, "string"];

// 튜플 (tuple) : 길이 제한까지 추가한 타입 시스템
let tuple: [number] = [1];
// tuple = [1, 2]; // 불가능
// tuple = ["str"]; // 불가능
let tuple2: [number, string, boolean] = [1, "string", true]; // 여러 타입과 혼합해서 사용도 가능하다

// 튜플과 배열의 성질을 혼합해서 사용할 수도 있다.
const httpStatusFromPaths: [number, string, ...string[]] = [
  400,
  "Bad Request",
  "/users/:id",
  "/users/userId",
  "/users/:uuid",
];

const optionalTuple: [number, number, number?] = [1, 2]; // 옵셔널(Optional): 3번째 인덱스는 있어도 되고 없어도 된다.

// enum 타입
enum ProgrammingLanguage {
  Typescript, // 0
  Javascript, // 1
  Java, // 2
  Python, // 3
  Kotlin, // 4
  Rust, // 5
  Go, // 6
}

// 각 멤버에게 접근하는 방식은 자바스크립트에서 객체의 속성에 접근하는 방식과 동일하다
ProgrammingLanguage.Typescript; // 0
ProgrammingLanguage.Rust; // 5
ProgrammingLanguage["Go"]; // 6

// 또한 역방향으로도 접근이 가능하다
ProgrammingLanguage[2]; // “Java”

// 타입스크립트의 enum은, 각 멤버의 값을 스스로 추론한다. 기본적인 방식은 0부터 1씩 늘려가며 값을 할당하는 것이다.
// 또한 각 멤버에 명시적으로 값을 할당할 수 있고, 일부 멤버에 직접 할당하지 않아도 이전 멤버를 기준으로 1씩 늘려가며 자동으로 할당한다.
/*enum ProgrammingLanguage {
  Typescript = "Typescript",
  Javascript = "Javascript",
  Java = 300,
  Python = 400,
  Kotlin, // 401
  Rust, // 402
  Go, // 403
}*/

// enum의 사용 예시
enum ItemStatusType {
  DELIVERY_HOLD = "DELIVERY_HOLD", // 배송 보류
  DELIVERY_READY = "DELIVERY_READY", // 배송 준비 중
  DELIVERING = "DELIVERING", // 배송 중
  DELIVERED = "DELIVERED", // 배송 완료
}

const checkItemAvailable = (itemStatus: ItemStatusType) => {
  switch (itemStatus) {
    case ItemStatusType.DELIVERY_HOLD:
    case ItemStatusType.DELIVERY_READY:
    case ItemStatusType.DELIVERING:
      return false;
    case ItemStatusType.DELIVERED:
    default:
      return true;
  }
};

console.log(checkItemAvailable(ItemStatusType.DELIVERY_HOLD)); // (O)
// console.log(checkItemAvailable("DELIVERED")); // (X)
