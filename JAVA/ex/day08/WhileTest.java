package day08;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("�ֿ���");
		}
		System.out.println("for�� �ٱ��� ����");
		
		int i = 0;
		while (i < 3) {
			System.out.println("�ֿ���");
			i++;
		}
		System.out.println("while�� �ٱ��� ����");
		
		
		// ����ڿ��� ������ ����Ͽ� �Է� �޴ٰ�
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("�����Է� (100���������� �׸��Է¹���) >> ");
			num = Integer.parseInt(sc.nextLine());
		} while (num >= 100);
		
		/*System.out.print("�����Է� (100���������� �׸��Է¹���) >> ");
		num = Integer.parseInt(sc.nextLine());
		while(num >= 100) {
			System.out.print("�����Է� (100���������� �׸��Է¹���) >> ");
			num = Integer.parseInt(sc.nextLine());
		}*/
		
		/*while(true) {
			System.out.print("�����Է� (100���� ũ�� �׸��Է¹���) >> ");
			int num = Integer.parseInt(sc.nextLine());
			
			// 100���� ū ���ڰ� �ԷµǴ� ���� �׸� �Է� �ޱ�
			if(num > 100)
				break;
		}*/
	
	}
}
