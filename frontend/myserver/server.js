// node_modules의 express 패키지를 가져온다.
const { Console } = require("console");
const express = require("express");
const path = require("path");
var app = express();

// 메인 페이지 접속시 html 응답하는 방법

// 미들웨어 : html, css, js, img 파일들이 담긴 곳 명시
app.use(express.static(path.join(__dirname, 'public')));

app.get("/", (req, res) => {
    console.log(__dirname);
    console.log(path.join(__dirname, 'public/main.html'));
    
    res.sendFile(path.join(__dirname, 'public/main.html'));
});

// // /hello 접속했을 때 hello.html을 보여주고 싶다.
// app.get("/hello", (req, res) => {
//     console.log(__dirname);

//     res.sendFile(path.join(__dirname, 'public/hello.html'));
// });

// app.get("/hello/test", (req, res) => {
//    res.sendFile(path.join(__dirname, 'public/test.html')); 
// });

// app.get("/api/hello",(req, res) => {
//     console.log("========================> /api/hello call");

//     res.send("Hello World!!!!");
// });

// 조회
app.get("/api/hello",(req, res) => {
    console.log("========================> [GET]/api/hello call req.query로 데이터를 가져온다.");
    console.log(req.query);
    res.send("[GET]서버에서 데이터를 가져온다.");
});

// 삽입
app.post("/api/hello",(req, res) => {
    console.log("========================> [POST]/api/hello call req.body로 데이터를 가져온다.");
    console.log(req.body);
    res.send("[POST]서버에서 데이터를 삽입온다.");
});

// 삭제
app.delete("/api/hello",(req, res) => {
    console.log("========================> [DELETE]/api/hello call req.body로 데이터를 가져온다.");
    console.log(req.query);
    res.send("[DELETE]서버에서 데이터를 삭제한다.");
});

// 수정
app.put("/api/hello",(req, res) => {
    console.log("========================> [PUT]/api/hello call req.query로 데이터를 가져온다.");
    console.log(req.body);
    res.send("[PUT]서버에서 데이터를 수정한다.");
});

const http = require("http").createServer(app);
// express 서버를 실행할 때 필요한 포트 정의 및 실행시 callback 함수를 받는다.
app.listen(8080, () => {
    console.log("start! express server!");
});

// const Module = require("./src/Day04/moduls.js");
// console.log(Module.add(1, 2));
// console.log(Module.sub(2, 1));
// console.log(Module.mul(3, 4));
// console.log(Module.div(10, 2));

// const Sys = require("./src/Day04/system.js");
// Sys.info();
// Sys.path();

// const Moment = require("./src/Day04/moment.js");
// Moment.today();
// Moment.date();
// Moment.format();
// Moment.add();
// Moment.diff();


// const ConsoleExam = require("./src/Day05/consoleExam.js");
// ConsoleExam.time();
// ConsoleExam.table();
// ConsoleExam.log();
// ConsoleExam.dir();
// ConsoleExam.rest();

// const TimerExam = require("./src/Day05/timer.js");
// TimerExam.timeout();
// TimerExam.interval();
// TimerExam.clear();
// TimerExam.counter();
// TimerExam.downcounter();

const SpreadExam = require("./src/Day05/SpreadExam.js");
// SpreadExam.exam01();
// SpreadExam.exam02();
SpreadExam.exam03();