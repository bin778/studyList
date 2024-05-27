// 제네릭(Generic) 타입
type ExampleArrayType<T> = T[];
const array1: ExampleArrayType<string> = ["치킨", "피자", "우동"];

type ExampleArrayType2 = any[];

// 제네릭을 사용하면 배열 요소가 전부 동일한 타입이라고 보장할 수 있다!
const array2: ExampleArrayType2 = [
  "치킨",
  {
    id: 0,
    name: "치킨",
    price: 20000,
    quantity: 1,
  },
  99,
  true,
];

// 참고로 제네릭 함수를 호출할 때 반드시 꺽쇠괄호 (<>) 안에 타입을 명시해야 하는 것은 아니다.
// 따라서 타입 추론이 가능한 경우에는 타입 명시 생략이 가능하다.
function exampleFunc<T>(arg: T): T[] {
  return new Array(3).fill(arg);
};

exampleFunc('hello'); // T는 string으로 추론된다

// 또한 특정 요소 타입을 알 수 없을 때는 제네릭 타입에 기본값을 추가할 수 있다.
// interface SubmitEvent<T = HTMLElement> extends SyntheticEvent<T> { submitter: T; }
// 제네릭은 함수나 클래스 등 내부에서 제네릭을 사용할 떄 어떤 타입이든 될 수 있다는 개념을 잊어선 안된다. 
// 특정한 타입에서만 존재하는 멤버를 참조하려고 하면 에러가 발생한다.
/*function exampleFunc2<T>(arg: T): number {
  return arg.length; // 에러 발생: Property 'length' does not exist on type 'T'
};*/
// 배열에만 존재하는 length 속성을 제네릭에서 참조하려고 하면 당연히 에러가 발생한다. 컴파일러는 어떤 타입이 제네릭에 전달될지 알 수 없기 때문에 모든 타입이 length 속성을 사용할 수는 없다고 알려주는 것이다.

// 제네릭 꺽쇠괄호 내부에 'length 속성을 가진 타입만 받는다'라는 제약을 걸어줌으로써 length 속성을 사용할 수 있게끔 만들 수 있다.
interface TypeWithLength {
  length: number;
}

function exampleFunc3<T extends TypeWithLength>(arg: T): number {
  return arg.length;
}

// 제네릭을 사용할 때 주의할 점!
// 파일 확장자가 tsx일 때 화살표 함수에 제네릭을 사용하면 에러가 발생한다. 
// tsx는 타입스크립트 + JSX 이므로 제네릭의 꺽쇠괄호와 태그의 꺽쇠괄호를 혼동하여 문제가 생기는 것이다.
// 이러한 상황을 피하기 위해서는 제네릭 부분에 extends 키워드를 사용하여 컴파일러에게 특정 타입의 하위 타입만 올 수 있음을 확실히 알려주면 된다. 
// 보통 제네릭을 사용할 때는 function 키워드로 선언하는 경우가 많다.
// 에러 발생: JSX Element 'T' has no corresponding closing tag
const arrowExampleFunc = <T>(arg: T): T[] => {
  return new Array(3).fill(arg);
};

// 에러 발생 x
const arrowExampleFunc2 = <T extends {}>(arg: T): T[] => {
  return new Array(3).fill(arg);
};

// 제네릭 예시
export interface MobileApiResponse<Data> {
  data: Data;
  statusCode: string;
  statusMessage: string;
}

export const fetchPriceInfo = (): Promise<MobileApiResponse<PriceInfo>> => {
  const priceUrl = "http: ~~~"; // url 주소
  
  return request({
    method: "GET",
    url: priceUrl,
  });
};

export const fetchOrderInfo = (): Promise<MobileApiResponse<Order>> => {
  const orderUrl = "http: ~~~"; // url 주소
  
  return request({
    method: "GET",
    url: orderUrl,
  });
};

// 제네릭이 필요하지 않을 때도 사용하면 코드 길이만 늘어나고 가독성을 해칠 수 있다.
type GType<T> = T;
type RequirementType1 = 'USE' | 'UN_USE' | 'NON_SELECT';
interface Order {
  getRequirement(): GType<RequirementType1>;
}

// GType이라는 이름이 현재 사용되고 있는 목적의 의미를 정확히 담고 있지도 않을뿐더러 굳이 제네릭을 사용하지 않고 매개변수를 그대로 선언하는 것과 같은 기능을 하고 있다.
type RequirementType2 = 'USE' | 'UN_USE' | 'NON_SELECT';
interface Order {
  getRequirement(): RequirementType2;
}
