package day04;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {		
		//target이라는 변수에는 소문자가 들어있다
		//target에 들어있는 소문자를 대문자로 바꾸어 출력하시오
		/*char target = 'a';
		System.out.println(target);
		System.out.println("대문자로 변환 >>");
		System.out.println((char)(target - 32));*/
		
		// 사용자에게 두 자릿수 정수를 입력받고
		// 십의자리와 일의자리를 각각 출력하기
		//입력예시
		// 정수 입력 >> 57
		//출력예시
		// 십의자리 : 5
		// 일의자리 : 7
		/*Scanner sc = new Scanner(System.in);
		int num, ten, one;
		
		System.out.print("정수 입력 >> ");
		num = Integer.parseInt(sc.nextLine());
		
		ten = num / 10;
		one = num % 10;
		
		System.out.printf("십의 자리 : %d\n", ten);
		System.out.printf("일의 자리 : %d\n", one);*/
		
		//사용자에게 국어 수학 점수를 입력받고(점수는 정수가 입력된다)
		// 평균을 출력하시오
		//입력예시
		// 국어점수 >> 85
		// 수학점수 >> 86
		//출력예시
		// 당신의 평균점수는 85.5입니다
		Scanner sc = new Scanner(System.in);
		int korean, math;
		double avg;
		
		System.out.print("국어점수 >> ");
		korean = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 >> ");
		math = Integer.parseInt(sc.nextLine());
		
		avg = (korean + math) / 2.0;
		System.out.println("당신의 평균점수는 " + avg + "점입니다.");
	}
}
