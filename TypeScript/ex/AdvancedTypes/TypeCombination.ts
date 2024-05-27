// 교차 타입(Intersection)
type ProductItem = {
  id: number;
  name: string;
  type: string;
  price: number;
  imageUrl: string;
  quantity: number;
};

// ProductItem과 discountAmount의 모든 멤버를 가지고 있다.
type ProductItemWithDiscount = ProductItem & { discountAmount: number };

// 유니온 타입(Union)
type CardItem = {
  id: number;
  name: string;
  type: string;
  imageUrl: string;
}

// ProudctItem과 CardItem 중 둘 중 하나의 멤버가 될 수 있다.
type PromotionEventItem = ProductItem | CardItem;

const printPromotionItem = (item: PromotionEventItem) => {
  console.log(item.name);
  // console.log(item.quantity); // (X) quantity는 CardItem에 포함되지 않기 때문
}

// 교차 타입과 유니온 타입은 여러 줄에 걸쳐 표기할 수도 있는데, 각 줄의 맨 앞에 &(교차) 또는 |(유니온)을 붙여서 표기하면 된다.
type PromotionEventItem2 = 
  | ProductItem
  | CardItem 

// 인덱스 시그니처(Index Signatures)
interface IndexSignatureEx {
  [key: string]: number;
}

interface IndexSignatureEx2 {
  [key: string]: number | boolean;
  length: number;
}

// 인덱스드 엑세스 타입(Indexed Access Types)
type Example = {
  a: number;
  b: string;
  c: boolean;
}

type IndexedAccess = Example["a"];
type IndexedAccess2 = Example["a" | "b"]; // number | string
type IndexedAccess3 = Example[keyof Example]; // number | string | boolean

type ExAlias = "b" | "c";
type IndexedAccess4 = Example[ExAlias]; // string | boolean

// 또한, 배열의 요소 타입을 조회하기 위해 인덱스드 엑세스 타입을 사용하는 경우가 있다.
const PromotionList = [
  { type: "product", name: "chicken" },
  { type: "product", name: "pizza" },
  { type: "card", name: "cheer-up" },
];

// 맵드 타입(Mapped Type)
const BottomSheetMap = {
  RECENT_CONTACTS: "RecentContactBottomSheet",
  CARD_SELECT: "CardSelectBottomSheet",
  SOFT_FILTER: "SoftFilterBottomSheet",
  PRODUCT_SELECT: "ProductSelectBottomSheet",
  REPLAY_CARD_SELECT: "ReplayCardSelectBottomSheet",
  RECEND: "RecendBottomSheet",
  STICKER: "StickerBottomSheet",
  BASE: null,
};

export type BOTTOM_SHEET_ID = keyof typeof BottomSheetMap;

// 불필요한 반복이 발생된다.
type BottomSheetStore1 = {
  RECENT_CONTACTS: {
    resolver?: (payload: any) => void;
    args?: any;
    isOpened: boolean;
  };
  CARD_SELECT: {
    resolver?: (payload: any) => void;
    args?: any;
    isOpened: boolean;
  };
  SOFT_FILTER: {
    resolver?: (payload: any) => void;
    args?: any;
    isOpened: boolean;
  };
  // ...
};

// Mapped Types를 통해 효율적으로 타입 선언을 할 수 있다.
type BottomSheetStore2 = {
  [index in BOTTOM_SHEET_ID]: {
    resolver?: (payload: any) => void;
    args?: any;
    isOpened: boolean;
  };
};

// 덧붙여 맵드 타입에서는 as 키워드를 사용하여 키를 재지정할 수 있다.
type BottomSheetStore = {
  [index in BOTTOM_SHEET_ID as `${index}_BOTTOM_SHEET`]: {
    resolver?: (payload: any) => void;
    args?: any;
    isOpened: boolean;
  };
};

// 템플릿 리터럴 타입(Template Literal Types)
type Stage = 
| "init"
| "select-image"
| "edit-image"
| "decorate-card"
| "capture-image";

type StageName = `${Stage}-stage`;
// 'init-stage' | 'select-image-stage' ...
