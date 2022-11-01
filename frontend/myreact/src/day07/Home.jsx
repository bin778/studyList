import { useState } from 'react';
import SAMPLE_IMG from "./images/sample-image.jpg";
import CLOSE_IMG from "./images/close.png";
import GAME_1 from "./images/game-1.jpg";
import GAME_2 from "./images/game-2.jpg";
import GAME_3 from "./images/game-3.jpg";

// 1차로 반복적인 아이템을 리펙토링하자.
export default function Home(props) {
    const [list, setList] = useState([
        {name: 'Cha & Kwon', title: '변호사 및 법률 사무소', text: '정천수 님.', img: GAME_1, count: 0},
        {name: '홍길동', title: '우리의 영웅', text: '홍길동의 무예는 1단.', img: GAME_2, count: 0},
        {name: '이순신', title: '임진왜란', text: '우리에겐 아직 12척의.', img: GAME_3, count: 0},
    ])

    const onClickLink = () => {
        window.open("https://www.daum.net");
    }

    const onClickLike = (item) => {
        item.count = item.count + 1;
        console.log(item);
        const array = [...list]
        setList(array);
    }

    return(
        <section className='container'>
            <ul className='list'>
                {/* 반복될 요소 */}
                {
                list.map(item => {
                    console.log(item);

                    return <li>
                        <div className='card'>
                            <img src={item.img} alt="샘플이미지" />
                            <div className='text'>
                                <span className='title' onClick={onClickLink}>{item.name}</span>
                                <span className='label'>{item.title}</span>
                                <span className='label'>{item.text}</span>
                                <span className='label'>{item.count}</span>
                            </div>
                            <button onClick={() => onClickLike(item)}>좋아요</button>
                            <span className='btn-box'>
                                <img src={CLOSE_IMG} alt="닫기 버튼" />
                            </span>
                        </div>
                    </li>
                })
                }

            </ul>
        </section>
    )
}