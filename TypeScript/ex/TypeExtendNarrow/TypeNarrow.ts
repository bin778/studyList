// 원시 타입을 추론할 때: type 연산자 활용하기
const replaceHHyphen: (date: string | Date) => string | Date = (date) => {
  if (typeof date === "string") {
    return date.replace(/-/g, '/');
  }
  return date;
}

// 인스턴스화된 객체 타입을 판별할 때: instnaceof 연산자 활용하기
interface Range {
  start: Date;
  end: Date;
}

// Date 타입이면 Range 타입으로 변경해주는 함수이다.
// 매개변수가 Date 객체를 프로토타입 체인 상에 가지고 있는지 여부를 통해 로직을 수행한다.
export function convertToRange(selected?: Date | Range): Range | undefined {
  return selected instanceof Date ? {start: selected, end: selected} : selected;
}
