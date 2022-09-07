package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 ... 10 ����ϱ�
		for (int i = 0; i < 10; i++)
			System.out.print((i + 1) + " ");
		
		// 1���� 10���� ���� ���� ���ϱ�
		int sum1 = 0;
		for (int i = 0; i < 10; i++)
			sum1 += (i + 1);
		System.out.println("\n���� : " + sum1);
		
		// 10! ��� ����ϱ�
		// 10! �� 10 * 9 * 8 * ... * 1 �̴�
		int sum2 = 1;
		for (int i = 0; i < 10; i++)
			sum2 *= (i + 1);
		System.out.println("���� : " + sum2);
		
		// 1���� 100������ ���� �� 3�� 4�� ������� ���η� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 4 == 0) // i�� 3, 4�� ������ �Ѵ� �������� 0�� ������
				System.out.print(i + " "); // i�� ����Ѵ�
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i++) {
			if (!(i % 3 == 0 && i % 4 == 0)) {
				continue; // ��� ���� �ݺ��� �����Ѵ�
//				System.out.println("����!"); dead code
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// ����ڿ��� ���� �Է¹ް�,
		// �ش� ������ ����ϱ�
		// �� �Է� >> 3
		// ---3��---
		// 3 X 1 = 3
		// 3 X 2 = 6
		// 3 X 3 = 9
		// ...
		// 3 X 9 = 27
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println(num + "���Դϴ�.");
		for (int i = 0; i < 9; i++)
			System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
	}
}
