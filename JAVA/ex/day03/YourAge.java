package day03;

import java.util.Scanner;

//����ڿ��� ���̸� �Է� �ް�,
// �Է¹��� ���� int Ÿ�� ���� age�� ������ �Ŀ�
// ����� ���̴� 00�� �Դϴ� ����ϱ�

public class YourAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int age;
		
		System.out.print("����� ���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		System.out.printf("����� ���̴� %02d���Դϴ�.", age);
	}
}