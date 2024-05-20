// 타입스크립트 구조적 타이핑의 특징 때문에 예기치 못한 결과가 나올 때도 있다.
interface Cube {
  width: number;
  height: number;
  depth: number;
}

function addLines(c: Cube) {
  let total = 0;

  for (const axis of Object.keys(c)) {
    const length = c[axis];
    total += length;
  }
}
