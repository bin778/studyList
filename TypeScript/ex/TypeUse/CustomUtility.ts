// 커스텀 유틸리티 타입
export type Props = {
  height?: string;
  color?: keyof typeof VideoColorSpace;
  isFull?: boolean;
  className?: string;
}

type StyledProps = Pick<Props, 'height' | 'color' | 'isFull'>;

// 유니온은 합집합이 되기 때문에 Card, Account 속성이 모두 포함되어도 타입 에러가 발생하지 않는다.
type Card = {
  card: string;
};

type Account = {
  account: string;
};

function withdraw(type: Card | Account) {
  // ...
}
  
withdraw({ card: "hyundai", account: "hana"});

// 해결 방법1 : 식별할 수 있는 유니온 기법을 이용해 객체 타입을 유니온으로 받기
type Card = {
  type: "card";
  card: string;
};

type Account = {
  type: "account";
  account: string;
};

function withdraw(type: Card | Account) {
  // ...
}
  
withdraw({ type: "card", card: "hyundai"});
withdraw({ type: "account", account: "hana" });
// 그러나 이 방법은 일일이 공통속성인 type을 넣어줘야하는 불편함이 있다.

// 해결 방법2 : PickOne이라는 커스텀 유틸리티 타입을 구현해서 적용하기
type One<T> = { [P in keyof T]: Record<P, T[P]> }[keyof T];

type Card = { card: string };
type Account = { account: string };
const one: One<Card> = { card: "hyundai" };

type ExcludeOne<T> = { [P in keyof T]: Partial<Record<Exclude<keyof T, P>, undefined>>;
}[keyof T];

type PickOne<T> = One<T> & ExcludeOne<T>;

const pickOne1: PickOne<Card & Account> = { card: "hyundai" };
const pickOne2: PickOne<Card & Account> = { account: "hana" };
const pickOne3: PickOne<Card & Account> = { card: "hyundai", account: undefined };
const pickOne4: PickOne<Card & Account> = { card: undefined, account: "hana" };
// const pickOne5: PickOne<Card & Account> = { card: "hyundai", account: "hana" }; // 사용 불가

// NonNullable 타입 검사 함수를 사용해 간편하게 타입 가드하기
function isNonNullable<T>(value: T): value is NonNullable<T> {
  return value !== null && value !== undefined;
}
