package day20;

public class Car {
	int carNum; // �ڵ��� ��ȣ
	String name; // ����
	
	//�ʱ�ȭ������
	public Car(int carNum, String name) {
		super(); //ObjectŬ������ ������
		this.carNum = carNum;
		this.name = name;
	}
	
	//���� ��ü�� ������ �������� ������ ��ü���� Ȯ���ϰ� ���� ��쿡��
	// Object Ŭ���� ���� ���ǵ� equals �޼ҵ带 �������̵� �ϸ�ȴ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car)
			return this.carNum == ((Car)obj).carNum;
		return false;
	}
	
	// ���� �� ��ü�� �������� ���� ��ü���
	// hashCode�� ���������ϱ� ������ hashCode����
	// �������̵� ���ش�
	@Override
	public int hashCode() {
		return carNum;
	}
	
	@Override
	public String toString() {
		return "����ȣ: " + carNum + " ����: " + name;
	}
}
