package InheritTest;

public class Main {
	public static void main(String[] args) {
		Car momCar = new Car();
		SuperCar myCar = new SuperCar();
		CrazyCar ddongCar = new CrazyCar();
		
		myCar.name = "�ֿ���";
		myCar.color = "red";
		myCar.manu = "Ferrari";
		myCar.carName = "488GTB";
		myCar.price = 35000;
		myCar.mode = "sports";
		
//		momCar.mode = "normal";
		momCar.name = "����";
		momCar.manu = "Hyundai";
		momCar.carName = "Grandeur";
		momCar.color = "black";
		momCar.price = 3000;
		
		ddongCar.name = "�˱�";
		ddongCar.color = "black";
		ddongCar.manu = "GomulCar";
		ddongCar.carName = "DdongCar";
		ddongCar.price = 99;
		
		myCar.go();
		myCar.engineOn();// �ڽ�Ÿ���� ������ �ȴ�� �����Ѵ�
		myCar.show();
		myCar.openRoof();
		System.out.println();
		
//		momCar.openRoof(); // �ڽĿ��� ���Ӱ� ���� �����
						  // �ڽ�Ÿ�� ��ü������ ��� ����
		momCar.go();
		momCar.engineOn(); // �θ𿡼� ���ǵȴ�� �����Ѵ�
		momCar.show();
		System.out.println();
		
		ddongCar.engineOn();// �ڽ�Ÿ���� ������ �ȴ�� �����Ѵ�
		ddongCar.go();
		ddongCar.show();
		ddongCar.SUA();
	}
}
