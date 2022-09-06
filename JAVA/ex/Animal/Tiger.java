package day17;

public class Tiger extends Animal { // �⺻ü�� : 70 ���̰��� : 70
	
	public Tiger() {
		super(70, 70);
	} 
	
	@Override
	public void eat() {
		feed -= 9;
		super.eat();
	}
	
	@Override
	public void rest() {
		System.out.println("ȣ���� �޽���~");
		for (int i = 0; i < 7; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("�������߻��ϸ� �����");
			}
			System.out.print("����!");
		}
		System.out.println();
		hp += 20;
		feed += 20;
		show();
	}
	
}
