package day20;

public class Car {
	int carNum; // 자동차 번호
	String name; // 차주
	
	//초기화생성자
	public Car(int carNum, String name) {
		super(); //Object클래스의 생성자
		this.carNum = carNum;
		this.name = name;
	}
	
	//만약 객체의 내용이 논리적으로 동일한 객체임을 확인하고 싶을 경우에는
	// Object 클래스 내에 정의된 equals 메소드를 오버라이딩 하면된다
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car)
			return this.carNum == ((Car)obj).carNum;
		return false;
	}
	
	// 보통 두 객체가 논리적으로 같은 객체라면
	// hashCode도 같아져야하기 때문에 hashCode까지
	// 오버라이딩 해준다
	@Override
	public int hashCode() {
		return carNum;
	}
	
	@Override
	public String toString() {
		return "차번호: " + carNum + " 주인: " + name;
	}
}
