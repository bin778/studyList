package day18;

public abstract class Animal {
	int feed;
	int hp;
	public void eat() {
		System.out.println("Animal Ŭ���� ���ǵ� eat()");
	}
	public void walk() {
		System.out.println("Animal Ŭ�������� ���ǵ� walk()");
	}
	public abstract void rest();
	
	
}
