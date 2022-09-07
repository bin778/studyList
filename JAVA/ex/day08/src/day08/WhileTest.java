package day08;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			System.out.println("최영빈");
		}
		System.out.println("for문 바깥쪽 문장");
		
		int i = 0;
		while (i < 3) {
			System.out.println("최영빈");
			i++;
		}
		System.out.println("while문 바깥쪽 문장");
		
		
		// 사용자에게 정수를 계속하여 입력 받다가
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("정수입력 (100보다작으면 그만입력받음) >> ");
			num = Integer.parseInt(sc.nextLine());
		} while (num >= 100);
		
		/*System.out.print("정수입력 (100보다작으면 그만입력받음) >> ");
		num = Integer.parseInt(sc.nextLine());
		while(num >= 100) {
			System.out.print("정수입력 (100보다작으면 그만입력받음) >> ");
			num = Integer.parseInt(sc.nextLine());
		}*/
		
		/*while(true) {
			System.out.print("정수입력 (100보다 크면 그만입력받음) >> ");
			int num = Integer.parseInt(sc.nextLine());
			
			// 100보다 큰 숫자가 입력되는 순간 그만 입력 받기
			if(num > 100)
				break;
		}*/
	
	}
}
