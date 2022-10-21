import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import Day02A1 from './day02/Day02A1.jsx';
import Day02A2 from './day02/Day02A2.js';
import Day02A3 from './day02/Day02A3.jsx';
import Day02A4 from './day02/Day02A4.jsx';
import Day02A5 from './day02/Day02A5.jsx';
import Day03A1 from './day03/Day03A1.jsx';
import Day03A2 from './day03/Day03A2.jsx';
import Day03A3 from './day03/Day03A3.jsx';
import Day03A4 from './day03/Day03A4.jsx';
// import Day03A5 from './day03/Day03A5.jsx';
import Day04 from './day04/Day04';

var start = 10;
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    // <App />
    // <Day02A1 />
    // <Day02A2 />
    // <Day02A3 />
    // <Day02A4 title="제 이름은" name="홍길동" age="40" />
    // <Day03A1 start={start} end="100" />
    // <Day03A2 max={10} />
    // <Day03A3 />
    // <Day03A4 text="안녕하세요" />
    // <Day03A5 />
    <Day04 />
);