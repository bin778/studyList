package day16;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("엄마");
		SuperCar myCar = new SuperCar("최영빈", 10500);
		
		System.out.println(momCar instanceof Car);// true
		System.out.println(momCar instanceof SuperCar);// false
		
		System.out.println(myCar instanceof Car);// true
		System.out.println(myCar instanceof SuperCar);// true
		
		System.out.println(momCar instanceof Object);// true
		System.out.println(myCar instanceof Object);// true
		
		momCar.go();
		momCar.engineOn();
//		momCar.openRoof();
		
		
		myCar.go();
		myCar.engineOn();
		myCar.openRoof();
		
		// 업캐스팅(자식이 부모로)
		// 자식 타입의 객체를 부모 타입에다 대입하는 문법
		Car sc = (Car)(new SuperCar("자식", 0));
		Car up = /* (Car) */myCar; // (Car) 생략가능
		// 업캐스팅 하더라도 자식타입을 잃어버리는 것이 아니다
		System.out.println(up instanceof SuperCar);
		
		System.out.println(sc.name);
		sc.go();
		sc.engineOn(); // 업캐스팅하면 자식에서 재정의한 메소드는 재정의 한대로 동작
//		sc.openRoof(); 업캐스팅하면 자식에서 새롭게 정의한 멤버가 사용X
//		sc.price = 100;
		
		// 다운캐스팅(부모가 자식으로)
		// 부모타입의 객체는 자식타입으로 다운캐스팅 할 수 없다
//		SuperCar d = (SuperCar)(new Car("부모"));
		// 부모로 업캐스팅된 객체를 다시 자식으로 되돌리는 문법
		SuperCar down = (SuperCar)sc;
		
		down.price = 100;
		down.openRoof();
		
//		double dou = 3;
//		int i = (int)3.1;
		
		
	}
}
