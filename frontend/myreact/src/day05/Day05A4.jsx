import {useEffect, useRef} from 'react';

export default function Day05A4() {
    const inputPrev = useRef();
    const inputNext = useRef();

    const onNext = () => {
        inputNext.current.focus();
        // const input = document.querySelector("#input");
        // input.focus();
    }

    const onPrev = () => {
        inputPrev.current.focus();
    }

    return (
        <div>
            <h3>useRef</h3>
            <div>
                <input type="text" ref={inputPrev} />
                <button onClick={onNext}>다음</button>
            </div>
            <div>
                <input id="input" type="text" ref={inputNext} />
                <button onClick={onPrev}>이전</button>
            </div>
        </div>
    )
}