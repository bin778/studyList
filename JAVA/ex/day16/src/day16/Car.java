package day16;

public class Car {
	String name;
	
//	public Car() {}
	
	//�ʱ�ȭ ������ ����Ű
	// alt shift s > o > �ʱ�ȭ �ϰ��� �ϴ� ���� ����
	public Car(String name) {
		super();// Object Ŭ������ ������
		this.name = name;
	}

	public void go() {
		System.out.println("�θ𿡼� ���ǵ� �޼ҵ�");
	}
	
	public void engineOn() {
		System.out.println("�ڽĿ��� �������� �޼ҵ�");
	}
}
