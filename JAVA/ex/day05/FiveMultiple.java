package day05;

import java.util.Scanner;

//사용자에게 정수를 입력받고, 해당 정수가 5의 배수라면
//5의 배수입니다 출력하기
//해당 정수의 5의배수가 아니라면 5의 배수가 아닙니다 출력하기

public class FiveMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("정수1 >> ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수2 >> ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num1 > num2)
			System.out.println(num1 + "가(이) 더 큽니다.");
		else if (num1 < num2)
			System.out.println(num2 + "가(이) 더 큽니다.");
		else
			System.out.println("두 수는 서로 같습니다.");
	}
}
