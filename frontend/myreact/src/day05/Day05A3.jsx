import {useState, useEffect} from "react"

export default function Day05A3(props) {
    const [count, setCount] = useState(Number(props.value));
    const [name, setName] = useState("홍길동");

    useEffect(() => {
        console.log(count);
        if(count === 5) {
            setName("김유신")
        } else if(count === 10) {
            setName("강감찬")
        }
    }, [count]);

    const onClickButton = () => {
        setCount(count + 1);
        console.log(count)

        // if(count === 4) {
        //     setName("김유신")
        // } else if(count === 9) {
        //     setName("강감찬")
        // }
    }

    return (
        <div>
            <h3>제 이름은 {name} 입니다.</h3>
            <p>count = {count}</p>
            <button type="button" onClick={onClickButton}>버튼을 클릭하세요</button>
        </div>
    )
}