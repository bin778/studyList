package day04;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {		
		//target�̶�� �������� �ҹ��ڰ� ����ִ�
		//target�� ����ִ� �ҹ��ڸ� �빮�ڷ� �ٲپ� ����Ͻÿ�
		/*char target = 'a';
		System.out.println(target);
		System.out.println("�빮�ڷ� ��ȯ >>");
		System.out.println((char)(target - 32));*/
		
		// ����ڿ��� �� �ڸ��� ������ �Է¹ް�
		// �����ڸ��� �����ڸ��� ���� ����ϱ�
		//�Է¿���
		// ���� �Է� >> 57
		//��¿���
		// �����ڸ� : 5
		// �����ڸ� : 7
		/*Scanner sc = new Scanner(System.in);
		int num, ten, one;
		
		System.out.print("���� �Է� >> ");
		num = Integer.parseInt(sc.nextLine());
		
		ten = num / 10;
		one = num % 10;
		
		System.out.printf("���� �ڸ� : %d\n", ten);
		System.out.printf("���� �ڸ� : %d\n", one);*/
		
		//����ڿ��� ���� ���� ������ �Է¹ް�(������ ������ �Էµȴ�)
		// ����� ����Ͻÿ�
		//�Է¿���
		// �������� >> 85
		// �������� >> 86
		//��¿���
		// ����� ��������� 85.5�Դϴ�
		Scanner sc = new Scanner(System.in);
		int korean, math;
		double avg;
		
		System.out.print("�������� >> ");
		korean = Integer.parseInt(sc.nextLine());
		System.out.print("�������� >> ");
		math = Integer.parseInt(sc.nextLine());
		
		avg = (korean + math) / 2.0;
		System.out.println("����� ��������� " + avg + "���Դϴ�.");
	}
}
