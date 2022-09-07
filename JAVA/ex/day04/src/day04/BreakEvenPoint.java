package day04;

import java.util.Scanner;

//사용자에게 물건 가격, 고용인원, 고정비와 판매한 물건 갯수를 입력 받아서
// 손익분기점을 넘겼다면 true 아니라면 false가 나오게 출력하여라
// 손익분기점 : 물건가격 * 물건갯수 - 고용인원 * 1000000 - 고정비

public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price, employee, fixed_cost, stock;
		int breakEvenPoint;
		
		System.out.print("물건 가격은? ");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("물건 갯수는? ");
		stock = Integer.parseInt(sc.nextLine());
		System.out.print("고용인원은? ");
		employee = Integer.parseInt(sc.nextLine());
		System.out.print("고정비는? ");
		fixed_cost = Integer.parseInt(sc.nextLine());
		
		breakEvenPoint = price * stock - employee * 1000000 - fixed_cost;
		
		System.out.println("손익분기점 : " + breakEvenPoint);
		System.out.println(breakEvenPoint > 0);
	}
}
