package day18;

public class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("Cat에서 재정의된 eat()메소드");
	}
	
	@Override
	public void rest() {
		System.out.println("Cat에서 재정의된 rest()메소드");
	}

	
}
