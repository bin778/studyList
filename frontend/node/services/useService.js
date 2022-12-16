const { User } = require('../models');
const bcrypt = require('bcrypt');
const passport = require('passport');
const jsonWebToken = require('jsonwebtoken');

// 단방향 암호화, 복구화(복구) = x, 값 비교만 가능

const UserService = {
    async login(req, res, next) {
        await passport.authenticate('local', (err, user, info) => {
            if (err) {
                return next(err);
            }
            if (info) {
                return res.status(400).json(info);
            }

            return req.login(user, async loginErr => {
                if (loginErr) {
                    return next(loginErr);
                }

                const token = jsonWebToken.sign({ id: user.id }, 'secret');
                res.status(200).json({ message: 'success', data: { token } });
            });
        })(req, res, next);
    },
    logout() {},
    async register(req, res, next) {
        try {
            /*
            users 테이블의 컬럼
            email, password ----> 프론트엔드 email, password, req
            json 데이터는 req.body에 전달
            */
            const exUser = await User.findOne({
                where: { email: req.body.email },
            });
            if (exUser) return res.status(400).send('이미 가입된 이메일입니다.');
            const hashPassword = await bcrypt.hash(req.body.password, 12);
            await User.create({
                email: req.body.email,
                password: hashPassword,
            });
            res.status(200).json({ message: 'success' });
        } catch (err) {
            next(err);
        }
    },
};

module.exports = UserService;
