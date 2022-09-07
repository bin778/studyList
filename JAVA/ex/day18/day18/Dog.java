package day18;

public class Dog extends Animal {
	@Override
	public void walk() {
		System.out.println("Dog에서 재정의된 walk()메소드");
	}
	
	@Override
	public void rest() {
		System.out.println("Dog에서 재정의된 rest()메소드");
	}
}
