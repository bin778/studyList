package day17;

public class Cat extends Animal { // �⺻ü�� : 50 ���̰��� : 50

	public Cat() {
		super(50, 50);
	} 
	
	@Override
	public void walk() {
		hp -= 10;
		feed += 10;
		show();
	}
	
	@Override
	public void rest() {
		System.out.println("����� �޽���~");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("�������߻��ϸ� �����");
			}
			System.out.print("�߿�!");
		}
		System.out.println();
		hp += 20;
		feed += 20;
		show();
	}
	
	public void onlyCat() {
		System.out.println("�߿˾߿�");
	}
	
}
