package day05;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(false ? "�ȳ�" : "�氡");
		
		// ����ڿ��� ���̸� �Է¹޾Ƽ�
		// �����̶�� �����Դϴ� �̼����ڶ�� �̼������Դϴ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println(age > 29 ? "�����Դϴ�" : "�̼������Դϴ�");
	}
}
