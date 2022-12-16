const { urlencoded } = require('express');
const express = require('express');
const db = require('./models/index');
const user = require('./routes/user');

const app = express();
app.use(express.json(), express.urlencoded({ extended: false }));
// json() 데이터를 읽게해주고 body-parser
// url 데이터를 query나 param을 nodejs 내부 모듈로 일겠다, 확장 프로그램 이용X

db.sequelize
    .sync()
    .then(() => {
        console.log('DB연결 성공하셨습니다.');
    })
    .catch(err => console.log(err));

app.use('/user', user);

app.listen(3000, () => {
    console.log('3000번으로 서버 실행 중');
});
