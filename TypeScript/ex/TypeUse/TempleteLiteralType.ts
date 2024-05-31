// 유니온 타입
type HeaderTag = "h1" | "h2" | "h3" | "h4" | "h5";

// 템플릿 리터럴 타입
type HeadingNumber = 1 | 2 | 3 | 4 | 5;
type HeaderTag = `h${HeadingNumber}`;

// 방향을 나타내는 타입 Direction이 있을 때(유니온 타입)
type Direction = 
	| "TopLeft"
	| "TopRight"
	| "BottomLeft"
	| "BottomRight";

// 위와 같이 일일이 적지 않고 템플릿 리터럴 타입을 활용할 수 있음
type Vertical = "Top" | "Bottom";
type Horizon = "Left" | "Right";

type Direction = Vertical | `${Vertical}${Capitalize<Horizon>}`;

// 템플릿 리터럴 타입의 식이 너무 복잡하면 에러를 발생할 수 있다.
type Digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9;
type Chunk = `${Digit}${Digit}${Digit}${Digit}`;
type PhoneNumberType = `010-${Chunk}-${Chunk}`;
