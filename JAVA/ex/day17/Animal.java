package day17;

public class Animal {
	int hp; // ����ü���� ������ ����
	int feed; // ���� ���̰����� ������ ����
	
	// alt shift s > o > enter
	public Animal(int hp, int feed) {
		super();// Object() : Object(�θ�)Ŭ������ ������
		this.hp = hp;
		this.feed = feed;
	}
	
	public void show() {
		System.out.println("���� ü�� : " + hp);
		System.out.println("���� ���İ��� : " + feed);
	}
	
	public void eat() {
		hp++;
		feed--;
		show();
	}
	
	public void walk() {
		hp--;
		feed++;
		show();
	}
	
	public void rest() {
		hp += 20;
		feed += 20;
		
		System.out.println("�޽� ����!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("�����߻��� �����");
		}
		System.out.println("�޽ĳ�!");
		show();
	}
	
}
