package day17;

public class Dog extends Animal {
	
	public Dog() {
		super(20, 20);
	}
	
	@Override
	public void eat() {
		hp += 3;
		feed -= 2;
		show();
	}
	
	@Override
	public void walk() {
		hp -= 4;
		super.walk();
	}
	
	@Override
	public void rest() {
		System.out.println("������ �޽���~");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("�������߻��ϸ� �����");
			}
			System.out.print("�۸�!");
		}
		System.out.println();
		hp += 20;
		feed += 20;
		show();
	}
	
}
