package day18;

public class Main {
	public static void main(String[] args) {
		// 추상클래스는 객체화/인스턴스화 불가능하다
//		Animal a = new Animal();
		Animal a = new Cat(); // Animal타입이 객체화
								// Cat타입 객체가 Animal타입으로 업캐스팅
		a.eat();
		a.walk();
		a.rest();
		
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.rest();
	}
}
