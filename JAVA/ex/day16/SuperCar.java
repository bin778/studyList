package day16;

public class SuperCar extends Car {
	int price;
	
	// �ڽĻ����� �ȿ��� �θ�����ڰ� ���� ���� ȣ���� �Ǿ�� �Ѵ�
	// alt shift s > c > ���ϴ� �θ������ ����
	public SuperCar(String name, int price) {
		super(name);
		this.price = price;
	}
	
	@Override
	public void engineOn() {
		System.out.println("�ڽĿ��� �����ǵ� �޼ҵ�");
	}

	public void openRoof() {
		System.out.println("�ڽĿ��� ���Ӱ� ���� �޼ҵ�");
	}
	
}
