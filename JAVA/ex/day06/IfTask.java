package day06;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �⵵�� �Է� �޾Ƽ� �������� �ƴ��� ����ϱ�
		// 4�ǹ���̸鼭 100�ǹ���̸鼭 400�� ����� �����̴�
		// 4�� ����̸鼭 100�ǹ���̸鼭 400�� ����� �ƴϸ� ����̴�
		// 4�� ����̸鼭 100�ǹ���¾ƴϰ�, 400�ǹ���� �ƴϸ� �����̴�
		// 4�ǹ���� �ƴϰ�, 100�ǹ���� �ƴϰ�, 400�� ����� �ƴϸ� ����̴�
		/*int year;
		String result = "";
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		year = Integer.parseInt(sc.nextLine());
		
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
			result = "����";
		else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0))
			result = "���";
		else if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0))
			result = "����";
		else if ((year % 4 != 0) && (year % 100 != 0) && (year % 400 != 0))
			result = "���";
	
		System.out.println(year + "���� " + result + "�Դϴ�");*/
		
		// ������ �Է� �޾Ƽ�
		// 90�̻� 100�̸�	:����� ������ A�Դϴ�
		// 80�̻� 90�̸�	:����� ������ B�Դϴ�
		// 70�̻� 80�̸�	:����� ������ C�Դϴ�
		// 70�̸�		:����� ������ F�Դϴ�
		// ����ϱ�
		int score;
		
		System.out.print("������ �Է��ϼ���: ");
		score = Integer.parseInt(sc.nextLine());
		
		if (score >= 90)
			System.out.println("����� ������ " + 'A' + "�Դϴ�");
		else if (score >= 80)
			System.out.println("����� ������ " + 'B' + "�Դϴ�");
		else if (score >= 70)
			System.out.println("����� ������ " + 'C' + "�Դϴ�");
		else
			System.out.println("����� ������ " + 'F' + "�Դϴ�");
	}
}
