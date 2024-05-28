// 타입 확장 예시
// BaseCartItem를 확장하여 EditableCartItem, EventCartItem 타입을 만든 것을 볼 수 있다.
// 이렇듯 장바구니에 관련된 요구사항이 생길 때마다 필요한 타입을 손쉽게 만들 수 있다.
interface BaseMenuItem {
  itemName: string | null;
  itemImageUrl: string | null;
  itemDiscountAmount: number;
  stock: number | null;
}

interface BaseCartItem extends BaseMenuItem {
  quantity: number;
}

interface EditableCartItem extends BaseCartItem {
  isSoldOut: boolean;
}

interface EventCartItem extends BaseCartItem {
  orderable: boolean;
}

// 유니온 타입
interface CookingStep {
  orderId: string;
  price: number;
}

interface DeliveryStep {
  orderId: string;
  time: number;
  distance: string;
}

function getDeliveryDistance(step: CookingStep | DeliveryStep) {
  // 유니온 타입으로 선언된 값은 유니온 타입에 포함된 모든 타입이 공통으로 갖고 있는 속성에만 접근할 수 있다.
  // return step.distance; 
  return step.orderId; 
}

// 교차 타입
interface DeliveryTip {
  tip: string;
}

interface StarRating {
  rate: number;
}

type Filter = DeliveryTip & StarRating;
const filter: Filter = {
  tip: "1000원 이하",
  rate: 4
}

// string과 number에 동시에 속하는 값은 없다. 때문에 IdType은 never 타입으로 설정된다.
type IdType = string | number;

// extends와 교차 타입
interface BaseMenuItem {
  itemName: string | null;
  itemImageUrl: string | null;
  itemDiscountAmount: number;
  stock: number | null;
}

interface BaseCartItem extends BaseMenuItem {
  quantity: number;
}

// 위 코드를 교차 타입으로 작성하면 아래와 같다.
type BaseMenuItem2 = {
  itemName: string | null;
  itemImageUrl: string | null;
  itemDiscountAmount: number;
  stock: number | null;
}

type BaseMenuItem3 = BaseMenuItem2 & { quantity: number; }

// 이처럼 extends는 교차 타입과 유사하지만 100% 똑같지는 않다.
// interface와 extends를 이용하는 경우 속성 간의 타입 호환이 되지 않는 경우 에러를 일으킬 수 있다.
interface DeliveryTip2 {
  tip: number;
}

interface Filter2 extends DeliveryTip2 {
  // tip: string; // 에러 발생
}

// 교차 타입을 통해 만든 경우
// type과 교차 타입을 이용하는 경우에는 속성 간의 타입이 호환되지 않는 경우 never 타입으로 설정된다.
type DeliveryTip3 = {
  tip: number;
}

type Filter3 = DeliveryTip3 & {tip: string}; // 단 tip속성은 never 타입이 된다.
