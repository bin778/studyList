package interTest;

public class Main {
	public static void main(String[] args) {
		// �������̽��� �߻�Ŭ������ ����������
		//�޸𸮻� �� ������ ����� ������
		//��üȭ �Ұ����ϴ�
//		Soldier s = new Soldier();
		// ��ĳ����
		Soldier a = new SecondMan();
		a.eat();
		
		Sergeant s = new Sergeant();
		s.salute();
		
		SecondMan sm = new SecondMan();
		
		sm.eat();
		sm.work();
		sm.salute();
	}
}
