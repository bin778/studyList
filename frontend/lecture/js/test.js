function 자판기(coin, product) {
    let menu = {
        솔의눈: 300,
        비타500: 500,
        콜라: 1000,
    };

    let productPrice = menu[product];

    if(!productPrice) return console.log("제품이 없습니다.");
    if(coin < productPrice) return console.log("금액이 부족합니다.");

    let change = coin - productPrice;
    if(change === 0) return console.log(product);
    return consnole.log(`주문하신 ${product} 이가 나왔습니다. 잔돈은 ${change}입니다.`);
}
/* 
원시타입, 참조타입

원시타입 (string, boolean, number)
참조타입 (object)

let arr = [1,2,3,5]
let arr = {
    0: 1
    1: 2
    2: 3
    3: 4
    4: 5
}

JSON
(Javascript Object Notation)

1. 데이터를 저장하거나 전송에 많이 쓰이는 데이터의 한 유형
2. 자바스크립트 에서는 객체를 만들 때 사용하는 표현식

ex)
/api/posts === 개시글을 조회하는 데이터를 받아왔음

[
    {
        id: 1
        title "오늘은 좋은 하루입니다."
        UserL {
            nameL: "김성용"
            profile_img: "src 경로"
        },
        Content: "내용",
        CreatedAt: "2022.12.08",
        Hits: 298,
        Comments: [ ... ]
    },
    {
    id: 1
    title "오늘은 좋은 하루입니다."
    UserL {
        nameL: "김성용"
        profile_img: "src 경로"
    },
    Content: "내용",
    CreatedAt: "2022.12.08",
    Hits: 298,
    Comments: [ ... ]
    }
]
*/