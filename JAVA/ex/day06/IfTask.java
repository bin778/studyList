package day06;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 년도를 입력 받아서 윤년인지 아닌지 출력하기
		// 4의배수이면서 100의배수이면서 400의 배수는 윤년이다
		// 4의 배수이면서 100의배수이면서 400의 배수가 아니면 평년이다
		// 4의 배수이면서 100의배수는아니고, 400의배수가 아니면 윤년이다
		// 4의배수도 아니고, 100의배수도 아니고, 400의 배수도 아니면 평년이다
		/*int year;
		String result = "";
		
		System.out.print("년도를 입력하세요: ");
		year = Integer.parseInt(sc.nextLine());
		
		if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
			result = "윤년";
		else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0))
			result = "평년";
		else if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0))
			result = "윤년";
		else if ((year % 4 != 0) && (year % 100 != 0) && (year % 400 != 0))
			result = "평년";
	
		System.out.println(year + "년은 " + result + "입니다");*/
		
		// 점수를 입력 받아서
		// 90이상 100미만	:당신의 학점은 A입니다
		// 80이상 90미만	:당신의 학점은 B입니다
		// 70이상 80미만	:당신의 학점은 C입니다
		// 70미만		:당신의 학점은 F입니다
		// 출력하기
		int score;
		
		System.out.print("점수를 입력하세요: ");
		score = Integer.parseInt(sc.nextLine());
		
		if (score >= 90)
			System.out.println("당신의 학점은 " + 'A' + "입니다");
		else if (score >= 80)
			System.out.println("당신의 학점은 " + 'B' + "입니다");
		else if (score >= 70)
			System.out.println("당신의 학점은 " + 'C' + "입니다");
		else
			System.out.println("당신의 학점은 " + 'F' + "입니다");
	}
}
