package day05;

import java.util.Scanner;

//����ڿ��� ������ �Է¹ް�, �ش� ������ 5�� ������
//5�� ����Դϴ� ����ϱ�
//�ش� ������ 5�ǹ���� �ƴ϶�� 5�� ����� �ƴմϴ� ����ϱ�

public class FiveMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("����1 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("����2 >> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num1 > num2)
			System.out.println(num1 + "��(��) �� Ů�ϴ�.");
		else if (num1 < num2)
			System.out.println(num2 + "��(��) �� Ů�ϴ�.");
		else
			System.out.println("�� ���� ���� �����ϴ�.");
	}
}
