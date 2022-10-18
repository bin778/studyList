import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import Day02A1 from './day02/Day02A1.jsx';
import Day02A2 from './day02/Day02A2.js';
import Day02A3 from './day02/Day02A3.jsx';
import Day02A4 from './day02/Day02A4.jsx';
import Day02A5 from './day02/Day02A5.jsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    // <App />
    // <Day02A1 />
    // <Day02A2 />
    // <Day02A3 />
    // <Day02A4 title="제 이름은" name="홍길동" age="40" />
    <Day02A5 title="제 이름은" name="홍길동" value="40" />
);