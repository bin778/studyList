package day05;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		System.out.println(false ? "안녕" : "방가");
		
		// 사용자에게 나이를 입력받아서
		// 성인이라면 성인입니다 미성년자라면 미성년자입니다 출력하기
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println(age > 29 ? "성인입니다" : "미성년자입니다");
	}
}
