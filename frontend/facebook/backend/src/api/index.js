const express = require("express");
const router = express.Router();
const mysql = require("./maria");

// /api/login POST 데이터를 전달 받는다.
router.post("/login", async (req, res) => {
  console.log(req.body);

  const { userid, password } = req.body;

  const results = await mysql.findUser(req.body);
  console.log(results);

  if (results && results.length > 0) {
    res.send({ result: "success" });
  } else {
    res.send({ result: "fail" });
  }
});

// /api/regist POST 데이터를 전달 받는다.
router.post("/regist", async (req, res) => {
  console.log(req.body);

  // 사용자 아이디 중복체크
  const user = await mysql.checkUser(req.body);
  console.log(user);

  // 중복되었으면 해당하는 코드를 보내자...
  if (user && user.length > 0) {
    res.send({ result: "dup-userid" });
  } else {
    // 중복되지 않은 경우만 삽입된다.
    const result = await mysql.insertUser(req.body);
    console.log(result);

    if (result) {
      res.send({ result: "success" });
    } else {
      res.send({ result: "fail" });
    }
  }
});

router.get("/identify", async (req, res) => {
  console.log(req.require);

  const { email } = req.query;

  const user = await mysql.findAccountid({ email });
  console.log(user);

  if (user) {
    res.send({ result: user.userId });
  } else {
    res.send({ result: "fail", text: "계정이 존재하지 않습니다." });
  }
});

router.delete("/user", async (req, res) => {
  const { email, userid } = req.query;

  const result = await mysql.deleteUser(req.query);
  console.log(result);

  if (result) {
    res.send({ result: "success" });
  } else {
    res.send({ result: "fail" });
  }
});

router.get("/home", async (req, res) => {
  console.log(req.query);

  const array = await mysql.selectHome();
  console.log(array);

  res.send({ result: array });
});

router.put("/home/like", async (req, res) => {
  console.log(req.body);

  // 1. 첫번째 likecount를 업데이트 하는 코드
  await mysql.updateLike(req.body);
  // 2. 업데이트한 데이터를 셀렉트(가져오는) 코드
  const item = await mysql.findHome(req.body);

  res.send({ result: item });
});

// 댓글 목록 가져오기
router.get("/home/comment", async (req, res) => {
  console.log(req.query);

  const array = await mysql.selectComment(req.query);
  res.send({ result: array });
});

// 댓글 추가하기
router.post("/home/comment", async (req, res) => {
  console.log(req.body);

  await mysql.InsertComment(req.body);
  res.send({ result: "success" });
  // const item = await mysql.selectComment(req.body);
  // res.send({ result: item });
});

// 댓글 삭제
router.delete("/home/comment", async (req, res) => {
  await mysql.deleteComment(req.query);
  res.send({ result: "success" });
});

// 댓글 편집
router.put("/home/comment", async (req, res) => {
  await mysql.updateComment(req.body);
  res.send({ result: "success" });
});

module.exports = router;
