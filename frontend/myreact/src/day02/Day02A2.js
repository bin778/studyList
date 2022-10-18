import React from "react";

// export default class Day02A2 extends React.Component {
//     render() {
//         const name = "홍길동";

//         return (
//             <>
//                 <div>Hello</div>
//                 <div>{name}</div>
//             </>
//         )
//     }
// }

// 근래에는 함수형 작성 방법을 더 많이 작성한다.
export default function Day02A2() {
    const name = "홍길동";

    return (
        <>
            <div>Hello</div>
            <div>{name}</div>
        </>
    )
}
