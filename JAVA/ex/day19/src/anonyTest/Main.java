package anonyTest;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car() {
			String mode;
			
			@Override
			public void engineOn() {
				System.out.println("��ư���� �õ��׽��ϴ�");
			}
			
			public void openRoof() {
				System.out.println("������ �������ϴ�");
			}
		};
		myCar.price = 100;
		myCar.go();
		myCar.engineOn();
//		myCar.openRoof(); // ��ĳ���õǸ� �ڽĿ��� ���Ӱ� �޼ҵ� ��� �Ұ�
		
		Soldier s = new Soldier() {
			@Override
			public void work() {
				System.out.println("�̵�� ���Ѵ�");
			}
			
			@Override
			public void salute() {
				System.out.println("�̵�� ����Ѵ�");
			}
			
			@Override
			public void eat() {
				System.out.println("�̵�� «���� �Դ´�");
			}
		};
		s.salute();
		s.work();
		s.eat();
		
	}
}
