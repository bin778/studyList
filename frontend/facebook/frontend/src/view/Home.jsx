import Header from "./Header.jsx";

export default function Home(props) {
    const onClickLogout = () => {
        window.location.href = "/";
        alert("로그아웃 되었습니다.");
    }

    return <>
        <Header name="home" onClick={onClickLogout} />
        Home 화면
    </>
}