package day10;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� �ټ����� ������ ���ʷ� �Է� �޾Ƽ�
		// 10¥�� �迭�� ������� �Է��ϱ�
		/*int[] ar1 = new int[10];
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� >> ");
			ar1[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("�Է��� 10���� �����Դϴ�.");
		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");
		System.out.println();*/
		
		// 5¥�� �迭�� ������� �ϱ�
		/*int[] ar1 = new int[5];
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� >> ");
			ar1[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("�Է��� 5���� �����Դϴ�.");
		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");
		System.out.println();*/
		
		// 2. �迭 �ӿ� ����� ��ҵ��� ������ ���� ����ϱ�
		// [10, 5, 8, 7, 15]		
		// int[] ar2 = {10, 5, 8, 7, 15};
		/*System.out.print("[");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i]);
			if (i < 4)
				System.out.print(", ");
		}
		System.out.println("]");*/
		
		// ���� for��
		/*System.out.print("[");
		for (int i : ar2) {
			System.out.print(i);
			if (i != 15)
				System.out.print(", ");
		}
		System.out.println("]");*/
		
		// 3. �ش� �迭 �ӿ��� �ִ��� ã�� ����ϱ�
		// �ִ� : 15
		/*int max = ar2[0];
		
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i] > max)
				max = ar2[i];
		}
		System.out.println("�ִ밪 : " + max);*/
		
		// 4. ����ڿ��� ���� ���� ���� ������ ���ʷ� �Է� �޾Ƽ�
		// ������� ����ϱ�(�迭�� Ȱ���Ͽ�)
		// �������� >> 100
		// �������� >> 100
		// �������� >> 99
		// ������� : 99.66��
		/*int[] score = new int[3];
		int total = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (i == 0)
				System.out.print("�������� >> ");
			else if (i == 1)
				System.out.print("�������� >> ");
			else if (i == 2)
				System.out.print("�������� >> ");
			score[i] = Integer.parseInt(sc.nextLine());
			total += score[i];
		}
		System.out.printf("������� : %.2f", (double)total / score.length);*/
	}
}
