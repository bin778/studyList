package day18;

public abstract class Animal {
	int feed;
	int hp;
	public void eat() {
		System.out.println("Animal 클래스 정의된 eat()");
	}
	public void walk() {
		System.out.println("Animal 클래스에서 정의된 walk()");
	}
	public abstract void rest();
	
	
}
