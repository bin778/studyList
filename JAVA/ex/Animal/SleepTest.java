package day17;

public class SleepTest {
	public static void main(String[] args) {
		// �Ͻ������� ������ �����ִ� �޼ҵ�
		// Thread Ŭ���� �ȿ� ��������ִ� sleep()
		// �Ű������� ���߰� �ִ� �и���
		// 1000ms == 1s
		System.out.println("����");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("�������߻��ϸ� �����");
			}
			System.out.println("������");
		}
		System.out.println("��");
	}
}
