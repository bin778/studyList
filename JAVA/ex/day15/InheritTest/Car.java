package InheritTest;

public class Car {
	String name;
	String color;
	String manu;
	String carName;
	int price;
	
	public void go() {
		System.out.println("�ڵ����� ������ ���ϴ�.");
	}
	
	public void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	public void engineOn() {
		System.out.println("��ư���� �õ��� �׽��ϴ�.");
	}
	
	public void engineOff() {
		System.out.println("��ư���� �õ��� �����ϴ�.");
	}
	
	public void show() {
		System.out.println("---��������---");
		System.out.println("���� : " + name);
		System.out.println("���� : " + color);
		System.out.println("������ : " + manu);
		System.out.println("�𵨸� : " + carName);
		if (price >= 10000) {
			System.out.print("���� : " + price / 10000 + "��");
			if (price % 10000 != 0)
				System.out.print(price % 10000 + "��");
			System.out.println("��");
		}
		else
			System.out.println("���� : " + price + "����");
	}
}
