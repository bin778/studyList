package day18;

public class Main {
	public static void main(String[] args) {
		// �߻�Ŭ������ ��üȭ/�ν��Ͻ�ȭ �Ұ����ϴ�
//		Animal a = new Animal();
		Animal a = new Cat(); // AnimalŸ���� ��üȭ
								// CatŸ�� ��ü�� AnimalŸ������ ��ĳ����
		a.eat();
		a.walk();
		a.rest();
		
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.rest();
	}
}
