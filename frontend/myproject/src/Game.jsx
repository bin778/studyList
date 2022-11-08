import GAME_A from './images/game-a.jpg'
import GAME_B from './images/game-b.jpg'
import GAME_C from './images/game-c.jpg'
import GAME_1 from './images/game-1.jpg'
import GAME_2 from './images/game-2.jpg'
import GAME_3 from './images/game-3.jpg'

import LEFT from './images/left.png'
import RIGHT from './images/right.png'

import Header from "./Header.jsx"
import Menu from "./Menu.jsx"
import React, { useEffect, useState } from "react";

export default function Game(props) {
    const [menu, setMenu] = useState(false);

    const onClickMenu = (show) => {
        setMenu(show);
    }

    return (
        <>
            <Header name="game" onClick={() => onClickMenu(true)} />
            <Menu show={menu} onClick={() => onClickMenu(false)} />
            <section className="home-layer game-layer">
            <ul className="list">
                <li className="img-box left">
                    <img src={GAME_A} alt="이미지" />
                </li>
                <li className="img-box center">
                    <button className="btn-prev"><img src={LEFT} alt="왼쪽" /></button>
                    <img src={GAME_B} alt="이미지" />
                    <button className="btn-next"><img src={RIGHT} alt="오른쪽" /></button>
                </li>
                <li className="img-box right">            
                    <img src={GAME_C} alt="이미지" />
                </li>
            </ul>
            
            <div className="card">
                <h3 className="title">추천게임</h3>
                <ul>
                <li className="c-li"><img src={GAME_1} /></li>
                <li className="c-li"><img src={GAME_2} /></li>
                <li className="c-li"><img src={GAME_3} /></li>
                <li className="c-li"><img src={GAME_1} /></li>
                <li className="c-li"><img src={GAME_2} /></li>
                <li className="c-li"><img src={GAME_3} /></li>
                <button className="btn-next"><img src={RIGHT} /></button>
                </ul>
            </div>
            </section>
        </>
    )
}