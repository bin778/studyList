package day10;

public class ArraryTest2 {
	public static void main(String[] args) {
		
		int[] ar = new int[3];
		System.out.println("����� ���� : " + ar.length);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(i + "��°��: " + ar[i]);
		}
		
		int [] ar2 = new int[3];
		int []ar3 = new int[3];
		int ar4[] = new int[3];
		
		String[] names = {"��ö��", "ȫ�浿", "�ڿ���"};
		
		for(int i = 0; i < names.length; i++) {
			String a = names[i];
			System.out.println(a);
		}
		
		System.out.println("----------------");
		// for��, foreach�� ���� for��
		// 1.5����(5����) ���ĺ��� �߰��� ����
		// a��� �������� �ݺ��� �ϸ� ������ names ��� �迭 �ӿ� �ִ�
		// ��Ұ� �����ϰ� �ȴ�.
		for (String a : names) {
			System.out.println(a);
		}
	}
}
