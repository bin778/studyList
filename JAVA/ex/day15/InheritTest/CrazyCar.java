package InheritTest;

public class CrazyCar extends Car {
	public void SUA() {
		System.out.println("�ڵ����� �޹����� �մϴ�.");
	}
	
	@Override
	public void engineOn() {
		System.out.println("��ư���� �õ��� �׽��ϴ�.");
	}
	
	@Override
	public void engineOff() {
		System.out.println("��ư���� �õ��� �����ϴ�.");
	}
}
