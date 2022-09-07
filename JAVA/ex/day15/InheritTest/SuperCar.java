package InheritTest;

public class SuperCar extends Car {
	String mode;
	
	//메소드 오버라이딩 overriding
	// 컴퓨터랑 소통하기 위해 사용하는 주석
	@Override // 어노테이션 주석
	public void show() {
		super.show(); // super : 부모클래스 Car
		System.out.println("모드 : " + mode);
	}
	
	public void openRoof() {
		System.out.println("컨버터블을 열었습니다");
	}
	
	public void closeRoof() {
		System.out.println("컨버터블을 닫았습니다");
	}
}
