package day05;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� ���� �� ���� �Է� �޾Ƽ�
		// �� �� �� ū �� ����ϱ�
		/*int a, b;
		String big_num;
		
		System.out.println("���� �� �� �Է� >>");
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		big_num = a > b ? a + "��" : b > a ? b + "��" : "����";
		System.out.println("�� �� �� ū ���� " + big_num + "�ϴ�.");*/
		
		// ����ڿ��� id�� �Է� �޾Ƽ�
		// �ش� id�� admin �̶�� �����ڸ��� ��ȯ�մϴ� ����ϰ�,
		// �ƴϸ� �Ϲ�ȸ�� ���� ��ȯ�մϴ� ����ϱ�
		/*String id, admin;
		
		System.out.print("����� ID�� �Է��Ͻÿ� : ");
		id = sc.nextLine();
		
		admin = id.equals("admin") ? "������" : "�Ϲ�ȸ��";
		System.out.println(admin + "���� ��ȯ�մϴ�.");*/
		
		// ����ڿ��� ���̸� �Է¹޾Ƽ�
		// �ش� ���̰� 10�� �̻� 30�� �̸��̶�� 500�� �� ���� ���̴� ���� ��� ����ϱ�
		/*int age;
		String age_price;
		
		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		age = Integer.parseInt(sc.nextLine());
		
		age_price = ((age >= 10) && (age < 30)) ? "500��" : "����";
		System.out.println(age_price + "�Դϴ�");*/
		
		// ����ڿ��� Ű�� �����Ը� �Է¹޾Ƽ�
		// Ű�� 190�� �Ѱų� �����԰� 100�� ������ ž���� �� �����ϴ�
		// �� ���� ��쿡�� ž�� �����մϴ� ����ϱ�
		/*double height, weight;
		String boarding;
		
		System.out.print("����� Ű�� �Է��Ͻÿ� : ");
		height = Double.parseDouble(sc.nextLine());
		System.out.print("����� �����Ը� �Է��Ͻÿ� : ");
		weight = Double.parseDouble(sc.nextLine());
		
		boarding = ((height >= 190) || (weight >= 100)) ? "�Ұ�" : "����";
		System.out.println("ž�� " + boarding);*/
	}
}
