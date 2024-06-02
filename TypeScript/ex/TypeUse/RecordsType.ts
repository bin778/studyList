// 무한한 키를 집합으로 가지는 Record
// 객체 foodByCatgory는 string 타입인 Category를 Record의 키로 사용하기 때문에 무한한 키 집합을 가진다. 
// 키로 "한식", "일식"이 아닌 없는 키값(ex. "양식")을 사용하더라도 컴파일 오류 없이 undefined가 된다.
type Category = string;
interface Food {
  name: string;
  // ...
}
const foodByCategory: Record<Category, Food[]> = {
  한식: [{ name: "제육덮밥" }, { name: "뚝배기 불고기" }],
  일식: [{ name: "초밥" }, { name: "텐동" }],
};

foodByCategory["양식"]; // Food[]로 추론
console.log(foodByCategory["양식"]); // ? undefined
// 그러나 foodByCategory["양식"]은 런타임에서 undefined가 되어 오류를 반환한다.
// foodByCategory["양식"].map((food) => console.log(food.name)); 

// 위와 같이 undefined로 인한 런타임 에러를 방지하기 위해서 옵셔널 체이닝(?.)을 사용한다.
// 하지만 이 방법은 undefined일 수 있는 값을 인지하고 코드를 작성해야하기 때문에 예상치 못한 런타임 에러가 발생할 수 있다.
foodByCategory["양식"]?.map((food) => console.log(food.name));

// 유닛 타입으로 변경하기
type Category = "한식" | "일식";

interface Food {
  name: string;
  // ...
}

// 유닛 타입으로 변경하기
const foodByCategory: Record<Category, Food[]> = {
  한식: [{ name: "제육덮밥" }, { name: "뚝배기 불고기" }],
  일식: [{ name: "초밥" }, { name: "텐동" }],
};

// 이렇게하면 한식, 일식 이외에 다른 키(양식)가 오면 에러를 발생시키게 할 수 있다.
// foodByCategory["양식"]; // (X)
// 하지만 키가 무한해야 하는 상황에는 적합하지 않다.

// Partial을 활용하여 정확한 타입 표현하기
type PartialRecord<K extends string, T> = Partial<Record<K, T>>;
type Category = string;
interface Food {
  name: string;
  // ...
}

const foodByCategory: PartialRecord<Category, Food[]> = {
  한식: [{ name: "제육덮밥" }, { name: "뚝배기 불고기" }],
  일식: [{ name: "초밥" }, { name: "텐동" }],
};

foodByCategory["양식"]; // Food[] 또는 undefined 타입으로 추론
// foodByCategory["양식"].map((food) => console.log(food.name)); // undefined를 반환하여 컴파일 오류를 잡을 수 있다.
foodByCategory["양식"]?.map((food) => console.log(food.name)); // (O)
