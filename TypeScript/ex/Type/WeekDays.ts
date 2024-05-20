// 클래스와 마찬가지로 enum 또한 런타임의 객체로 변환하는 값이다.
// enum은 런타임에 실체 객체로 존재하며, 함수로 표현할 수도 있다.
enum WeekDays {
  MON = "Mon",
  TUES = "Tues",
  WEDNES = "Wednes",
  THURS = "Thurs",
  FRI = "Fri",
}

type WeekDaysKey = keyof typeof WeekDays;
function printDay(key: WeekDaysKey, message: string) {
  const day = WeekDays[key];
  if (day <= WeekDays.WEDNES) {
    console.log(`It's still ${day}day, ${message}`);
  }
}

printDay("TUES", "wanna go home");
