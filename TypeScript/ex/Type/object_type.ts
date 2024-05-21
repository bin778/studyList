// object 타입
function isObject(value: object) {
  return (
    Object.prototype.toString.call(value).replace(/\[|\]|\s|object/g, "") === "Object"
  )
}

// 객체, 배열, 정규 표현식, 함수, 클래스 등 모든 object 타입과 호환된다.
isObject({});
isObject({ name: "KG" });
isObject([0, 1, 2]);
isObject(new RegExp("object"));
isObject(function() {
  console.log("Hello World!");
});
isObject(class Class {});

// 그러나 원시 타입은 호환되지 않는다.
// isObject(20);
// isObject("KG");

// {} 타입 (참고로 타입스크립트에서는 지정된 객체에는 어떤 값도 속성으로 할당할 수 없다)
// const noticePopup = { title: string, description: string } = {
//   title: "IE 지원 종료 안내",
//   description: "2022.07.15일부로 배민상회 IE 브라우저 지원을 종료합니다."
// }

// 타입스크립트에서 {} 지정된 객체는 완전히 비어있는 순수한 객체를 의미하는 것이 아니다.
let noticePopup: {} = {};
// noticePopup.title = "IE 지원 종료 안내"; (X) title 속성을 지정할 수 없음
console.log(noticePopup.toString());

// array 타입
const targetCodes1: ["CATEGORY", "EXHIBITION"] = ["CATEGORY", "EXHIBITION"];
// const targetCodes2: ["CATEGORY", "EXHIBITION"] = ["CATEGORY", "EXHIBITION", "SALE"]; // (X)

// type과 interface 타입
type NoticePopupType = {
  title: string;
  description: string;
};

interface INoticePopup {
  title: string;
  description: string;
}

const noticePopup1: NoticePopupType = { title: "제목", description: "묘사" };
const noticePopup2: INoticePopup = { title: "제목", description: "묘사" };

// function 타입(타입스크립트에서는 타입을 지정해줘야 한다)
function add(a: number, b: number) {
  return a + b;
}

console.log(typeof add);

// 호출 시그니저 방식
type add = (a: number, b: number) => number;
