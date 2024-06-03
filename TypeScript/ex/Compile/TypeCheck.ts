interface Square {
  width: number;
}

interface Rectangle extends Square {
  height: number;
}

type Shape = Square | Rectangle;

function calculateArea(shape: Shape): number {
  // if (shape instanceof Rectangle) // (X) 타입스크립트 타입은 자바스크립트로 컴파일할 때 구문이 제거되기 때문에 런타임에서는 사용 불가
  if ('height' in shape) {
    return shape.width * shape.height;
  } else {
    return shape.width * shape.width;
  }
}

// 테스트
const square: Square = { width: 10 };
const rectangle: Rectangle = { width: 10, height: 20 };

console.log(`사각형1: ${calculateArea(square)}`);
console.log(`사각형2: ${calculateArea(rectangle)}`);
