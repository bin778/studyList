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

router.get("/identify", (req, res) => {
  console.log(req.require);

  const { email } = req.query;

  if (email == "sentron@email.com") {
    res.send({ result: "sentron" });
  } else if (email === "aaa@email.com") {
    res.send({ result: "aaa123" });
  } else if (email === "bbb@email.com") {
    res.send({ result: "bbb123" });
  } else {
    res.send({ result: "fail", text: "계정이 존재하지 않습니다." });
  }
});

router.delete("/user", (req, res) => {
  const { email, userid } = req.query;

  if (email === "sentron@email.com" && userid === "sentron") {
    res.send({ result: "success" });
  } else {
    res.send({ result: "fail" });
  }
});

const array = [
  {
    no: 1,
    title: "에듀윌",
    subtitle: "🚨기간한정 특별 이벤트🚨 초시생 필수템, 만화입문서 무료배포!",
    tags: "#합격자수1위 #에듀윌 #공인중개사",
    url: "EDUWILL.NET",
    text: "입문교재 선착순 무료신청☞ 합격자 수 1위 에듀윌 공인중개사",
    image: "/images/game-1.jpg",
    likecount: 1,
  },
  {
    no: 2,
    title: "코리아아이티",
    subtitle: "🚨기간한정 특별 이벤트🚨 프론트엔드 5개월차 수업!",
    tags: "#합격자수1위 #코리아아이티 #프론트엔드",
    url: "KOREAIT.NET",
    text: "녹화 동영상 무료 제공!☞ 합격자 수 1위 에듀윌 공인중개사",
    image: "/images/game-2.jpg",
    likecount: 2,
  },
];

router.get("/home", (req, res) => {
  console.log(req.query);

  res.send({ result: array });
});

router.put("/home/like", (req, res) => {
  console.log(req.body);

  const { no, like } = req.body;

  const data = array.find((item) => item.no === no);
  data.likecount = Number(data.likecount) + Number(like);

  console.log(array);

  res.send({ result: "success" });
});

module.exports = router;
