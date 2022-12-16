const Sequelize = require('sequelize');
const config = require('../config/config');
const env = 'development'; // cross-env를 활용하여 배포용일 때는 produection으로 적용
const dbconfig = config[env]; // config.js의 development 설정

const user = require('./user'); // 설정된 테이블 정보

const sequelize = new Sequelize(dbconfig.database, dbconfig.username, dbconfig.password, dbconfig);
const db = {};

db.User = user;
Object.keys(db).forEach(name => {
    db[name].init(sequelize);
});

db.sequelize = sequelize;
db.Sequelize = Sequelize;
// 객체 값 채워준거

module.exports = db;
