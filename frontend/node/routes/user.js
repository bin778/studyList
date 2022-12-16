const express = require('express');
const UserService = require('../services/useService');
const router = express.Router();

router.post('/login', UserService.login);
router.post('/logout', UserService.logout);
router.post('/register', UserService.register);

module.exports = router;
