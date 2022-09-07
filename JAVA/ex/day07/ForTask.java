package day07;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 ... 10 출력하기
		for (int i = 0; i < 10; i++)
			System.out.print((i + 1) + " ");
		
		// 1부터 10까지 숫자 총합 구하기
		int sum1 = 0;
		for (int i = 0; i < 10; i++)
			sum1 += (i + 1);
		System.out.println("\n총합 : " + sum1);
		
		// 10! 결과 출력하기
		// 10! 은 10 * 9 * 8 * ... * 1 이다
		int sum2 = 1;
		for (int i = 0; i < 10; i++)
			sum2 *= (i + 1);
		System.out.println("총합 : " + sum2);
		
		// 1부터 100까지의 숫자 중 3과 4의 공배수만 가로로 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 4 == 0) // i가 3, 4로 나눠서 둘다 나머지가 0이 나오면
				System.out.print(i + " "); // i를 출력한다
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i++) {
			if (!(i % 3 == 0 && i % 4 == 0)) {
				continue; // 즉시 다음 반복을 실행한다
//				System.out.println("실행!"); dead code
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 사용자에게 단을 입력받고,
		// 해당 구구단 출력하기
		// 단 입력 >> 3
		// ---3단---
		// 3 X 1 = 3
		// 3 X 2 = 6
		// 3 X 3 = 9
		// ...
		// 3 X 9 = 27
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하시오: ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println(num + "단입니다.");
		for (int i = 0; i < 9; i++)
			System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
	}
}
