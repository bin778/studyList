package day03;

import java.util.Scanner;

//사용자에게 나이를 입력 받고,
// 입력받은 값을 int 타입 변수 age에 저장한 후에
// 당신의 나이는 00살 입니다 출력하기

public class YourAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int age;
		
		System.out.print("당신의 나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.printf("당신의 나이는 %02d살입니다.", age);
	}
}
