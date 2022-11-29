import IMG_LOGO from "../images/facebook-logo.svg"
import {InputBox} from "./Component.jsx"

export default function Login(props) {
    return (
        <div className="login-layer">
            <div className="logo-box">
                <img src={IMG_LOGO} alt="" />
                <h2>Facebook에서 전세계에 있는 가족, 친구 지인들과 함께 이야기를 나눠보세요.</h2>
            </div>
            <div className="login-box">
                <div>
                    <div>
                        <input id="email" className="input-email" type="text" name="email" placeholder="이메일 또는 전화번호" />
                    </div>
                    <div>
                        <input id="pass" className="input-pass" type="password" name="pass" placeholder="비밀번호" />
                    </div>
                    <div>
                        <button className="login-button" name="login" type="submit" onClick="login();">로그인</button>
                    </div>
                    <div>
                        <a href="./Idenfity.jsx">비밀번호를 잊으셨나요?</a>
                    </div>
                    <div className="div-line"></div>
                    <div>
                        <a className="regist" href="Regist.jsx">새 계정 만들기</a>
                    </div>
                </div>
            </div>
            <div className="new-page">
                <a href="Header.jsx">페이지 만들기</a>
            </div>
        </div>
    )
}