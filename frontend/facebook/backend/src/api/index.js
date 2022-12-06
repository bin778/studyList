const express = require("express")
const router = express.Router()

// /api/login POST 데이터를 전달 받는다.
router.post("/login", (req, res) => {
  console.log("=================> [POST]/api/login call!!!")

  console.log(req.body)

  const {userid, password} = req.body
  if(userid === "sentron" && password === "1234") {
    res.send({result: "success"})
  } else {
    res.send({result: "fail"})
  }

})

// /api/regist POST 데이터를 전달 받는다.
router.post("/regist", (req, res) => {
  console.log("=================> [POST]/api/regist call!!!")

  console.log(req.body)

  const {name, userid, password, year, month, day, gender} = req.body

  if(name && userid && password && year && month && day && gender) {
    res.send({result: "success"})
  } else {
    res.send({result: "fail"})
  }
})

router.get("/identify", (req, res) => {
  console.log("=================> [GET]/api/identify call!!!!");

  console.log(req.require)

  const {email} = req.query

  if(email == "sentron@email.com") {
    res.send({result: "sentron"});
  } else if(email === "aaa@email.com") {
    res.send({result: "aaa123"});
  } else if(email === "bbb@email.com") {
    res.send({result: "bbb123"});
  } else {
    res.send({result: "fail", text: "계정이 존재하지 않습니다."});
  }
})

router.delete("/user", (req, res) => {
  console.log("=================> [GET]/api/user call!!!!");

  const {email, userid} = req.query;

  if(email === "sentron@email.com" && userid === "sentron") {
    res.send({result: "success"});
  } else {
    res.send({result: "fail"});
  }
})

const array = [
  {
      no: 1,
      title: "에듀윌",
      subtitle: "🚨기간한정 특별 이벤트🚨 초시생 필수템, 만화입문서 무료배포!",
      tags: "#합격자수1위 #에듀윌 #공인중개사",
      url: "EDUWILL.NET",
      text: "입문교재 선착순 무료신청☞ 합격자 수 1위 에듀윌 공인중개사",
      image: "/images/game-1.jpg",
      likecount: 1
  },
  {
      no: 2,
      title: "코리아아이티",
      subtitle: "🚨기간한정 특별 이벤트🚨 프론트엔드 5개월차 수업!",
      tags: "#합격자수1위 #코리아아이티 #프론트엔드",
      url: "KOREAIT.NET",
      text: "녹화 동영상 무료 제공!☞ 합격자 수 1위 에듀윌 공인중개사",
      image: "/images/game-2.jpg",
      likecount: 2
  }
]

router.get("/home", (req, res) => {
  console.log("=================> [GET]/api/home call!!!!");
  console.log(req.query);

  res.send({result: array});
})

router.put("/home/like", (req, res) => {
  console.log("=================> [GET]/api/home/like call!!!!");
  console.log(req.body);

  const {no, like} = req.body;

  const data = array.find(item => item.no === no)
  data.likecount = Number(data.likecount) + Number(like);

  console.log(array);

  res.send({result: "success"});
})

module.exports = router;