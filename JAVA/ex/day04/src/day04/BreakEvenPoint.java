package day04;

import java.util.Scanner;

//����ڿ��� ���� ����, ����ο�, ������� �Ǹ��� ���� ������ �Է� �޾Ƽ�
// ���ͺб����� �Ѱ�ٸ� true �ƴ϶�� false�� ������ ����Ͽ���
// ���ͺб��� : ���ǰ��� * ���ǰ��� - ����ο� * 1000000 - ������

public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price, employee, fixed_cost, stock;
		int breakEvenPoint;
		
		System.out.print("���� ������? ");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������? ");
		stock = Integer.parseInt(sc.nextLine());
		System.out.print("����ο���? ");
		employee = Integer.parseInt(sc.nextLine());
		System.out.print("�������? ");
		fixed_cost = Integer.parseInt(sc.nextLine());
		
		breakEvenPoint = price * stock - employee * 1000000 - fixed_cost;
		
		System.out.println("���ͺб��� : " + breakEvenPoint);
		System.out.println(breakEvenPoint > 0);
	}
}
