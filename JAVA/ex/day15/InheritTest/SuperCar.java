package InheritTest;

public class SuperCar extends Car {
	String mode;
	
	//�޼ҵ� �������̵� overriding
	// ��ǻ�Ͷ� �����ϱ� ���� ����ϴ� �ּ�
	@Override // ������̼� �ּ�
	public void show() {
		super.show(); // super : �θ�Ŭ���� Car
		System.out.println("��� : " + mode);
	}
	
	public void openRoof() {
		System.out.println("�����ͺ��� �������ϴ�");
	}
	
	public void closeRoof() {
		System.out.println("�����ͺ��� �ݾҽ��ϴ�");
	}
}
