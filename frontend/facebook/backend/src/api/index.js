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
  console.log("=================> [GET]/api/user call!!!!")

  const {email, userid} = req.query;

  if(email === "sentron@email.com" && userid === "sentron") {
    res.send({result: "success"});
  } else {
    res.send({result: "fail"});
  }
})

module.exports = router;