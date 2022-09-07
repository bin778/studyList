package day16;

public class SuperCar extends Car {
	int price;
	
	// 자식생성자 안에서 부모생성자가 가장 먼저 호출이 되어야 한다
	// alt shift s > c > 원하는 부모생성자 선택
	public SuperCar(String name, int price) {
		super(name);
		this.price = price;
	}
	
	@Override
	public void engineOn() {
		System.out.println("자식에서 재정의된 메소드");
	}

	public void openRoof() {
		System.out.println("자식에서 새롭게 만든 메소드");
	}
	
}
