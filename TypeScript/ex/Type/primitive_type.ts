// boolean 타입
const isEmpty: boolean = true;
const isLoading: boolean = false;

// undefined 타입
let value1: string; // undefined (값이 아직 할당되지 않음)
// console.log(value1); // undefined (값이 아직 할당되지 않음)

type Person = {
  name: string;
  job?: string;
}

// null 타입
let value2: null | undefined;
// console.log(value2); // undefined (값이 아직 할당되지 않음)

value2 = null;
// console.log(value2);

// undefined와 null의 차이
type Person1 = {
  name: string;
  job?: string;
}

type Person2 = {
  name: string;
  job: string | null;
}

// number 타입
const num1: number = 10;
const num2: number = 120.3;
const max: number = +Infinity;
const notNum: number = NaN;

// bigInt 타입(number 타입과 상호 작용 불가)
const bigNum1: bigint = BigInt(999999999999999);
const bigNum2: bigint = 999999999999999n;

// string 타입
const str1: string = "안녕하세요!";
const str2: string = "010-1234-5678";
const str3: string = `${str1} 저의 전화번호는 ${str2}입니다.`; // 템플릿 리터럴(Templete Literal) 문법

// symbol 타입
const TITLE1 = Symbol("Hello");
const TITLE2 = Symbol("Hello");
// console.log(TITLE1 === TITLE2); // false
