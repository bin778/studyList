import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
// import Request from './Request.jsx'
import Day02A1 from './Day02/Day02A1.jsx'
import HttpExam from './Day05/HttpExam.jsx'
import ConsoleExam from './Day05/ConsoleExam.jsx';
import PromiseExam from './Day06/PromiseExam.jsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Request /> */}
    {/* <Day02A1 /> */}
    <HttpExam />
  </React.StrictMode>
);

// export default Day02A1;
// ConsoleExam.time();
// ConsoleExam.table();
// ConsoleExam.log();
// ConsoleExam.dir();
// ConsoleExam.rest();
// PromiseExam.callback();
// PromiseExam.callbackFunc();
// PromiseExam.promise();
// PromiseExam.promiseCatch();
// PromiseExam.promiseThen();
PromiseExam.promiseAsync();