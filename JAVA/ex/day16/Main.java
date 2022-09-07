package day16;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car("����");
		SuperCar myCar = new SuperCar("�ֿ���", 10500);
		
		System.out.println(momCar instanceof Car);// true
		System.out.println(momCar instanceof SuperCar);// false
		
		System.out.println(myCar instanceof Car);// true
		System.out.println(myCar instanceof SuperCar);// true
		
		System.out.println(momCar instanceof Object);// true
		System.out.println(myCar instanceof Object);// true
		
		momCar.go();
		momCar.engineOn();
//		momCar.openRoof();
		
		
		myCar.go();
		myCar.engineOn();
		myCar.openRoof();
		
		// ��ĳ����(�ڽ��� �θ��)
		// �ڽ� Ÿ���� ��ü�� �θ� Ÿ�Կ��� �����ϴ� ����
		Car sc = (Car)(new SuperCar("�ڽ�", 0));
		Car up = /* (Car) */myCar; // (Car) ��������
		// ��ĳ���� �ϴ��� �ڽ�Ÿ���� �Ҿ������ ���� �ƴϴ�
		System.out.println(up instanceof SuperCar);
		
		System.out.println(sc.name);
		sc.go();
		sc.engineOn(); // ��ĳ�����ϸ� �ڽĿ��� �������� �޼ҵ�� ������ �Ѵ�� ����
//		sc.openRoof(); ��ĳ�����ϸ� �ڽĿ��� ���Ӱ� ������ ����� ���X
//		sc.price = 100;
		
		// �ٿ�ĳ����(�θ� �ڽ�����)
		// �θ�Ÿ���� ��ü�� �ڽ�Ÿ������ �ٿ�ĳ���� �� �� ����
//		SuperCar d = (SuperCar)(new Car("�θ�"));
		// �θ�� ��ĳ���õ� ��ü�� �ٽ� �ڽ����� �ǵ����� ����
		SuperCar down = (SuperCar)sc;
		
		down.price = 100;
		down.openRoof();
		
//		double dou = 3;
//		int i = (int)3.1;
		
		
	}
}
