package InheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		SuperCar myCar = new SuperCar();
		CrazyCar ddongCar = new CrazyCar();
		
		myCar.name = "최영빈";
		myCar.color = "red";
		myCar.manu = "Ferrari";
		myCar.carName = "488GTB";
		myCar.price = 35000;
		myCar.mode = "sports";
		
//		momCar.mode = "normal";
		momCar.name = "엄마";
		momCar.manu = "Hyundai";
		momCar.carName = "Grandeur";
		momCar.color = "black";
		momCar.price = 3000;
		
		ddongCar.name = "똥구";
		ddongCar.color = "black";
		ddongCar.manu = "GomulCar";
		ddongCar.carName = "DdongCar";
		ddongCar.price = 99;
		
		myCar.go();
		myCar.engineOn();// 자식타입은 재정의 된대로 동작한다
		myCar.show();
		myCar.openRoof();
		System.out.println();
		
//		momCar.openRoof(); // 자식에서 새롭게 만든 멤버는
						  // 자식타입 객체에서만 사용 가능
		momCar.go();
		momCar.engineOn(); // 부모에서 정의된대로 동작한다
		momCar.show();
		System.out.println();
		
		ddongCar.engineOn();// 자식타입은 재정의 된대로 동작한다
		ddongCar.go();
		ddongCar.show();
		ddongCar.SUA();
	}
}
