package day10;

public class ArrayTest {
	public static void main(String[] args) {
		// 80, 90, 10�� ��ҷ� ����ִ� �迭 ar ���� �� �ʱ�ȭ �ϱ�
		int[] ar = {80, 90, 10};
		
		System.out.println(ar);
		
		// �迭.length : �ش� �迭�� ����� ������ ��� ����̴�(��� ����� int Ÿ�� ��)
		System.out.println("�迭�� ����: " + ar.length);
		
		ar[0] = 100;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]); �ε��� ���� ����� ���� �߻�
		
		
	}
}
