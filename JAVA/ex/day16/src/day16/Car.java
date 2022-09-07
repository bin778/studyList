package day16;

public class Car {
	String name;
	
//	public Car() {}
	
	//초기화 생성자 단축키
	// alt shift s > o > 초기화 하고자 하는 변수 선택
	public Car(String name) {
		super();// Object 클래스의 생성자
		this.name = name;
	}

	public void go() {
		System.out.println("부모에서 정의된 메소드");
	}
	
	public void engineOn() {
		System.out.println("자식에서 재정의할 메소드");
	}
}
