package day05;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수 두 개를 입력 받아서
		// 둘 중 더 큰 수 출력하기
		/*int a, b;
		String big_num;
		
		System.out.println("정수 두 개 입력 >>");
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		
		big_num = a > b ? a + "입" : b > a ? b + "입" : "같습";
		System.out.println("둘 중 더 큰 수는 " + big_num + "니다.");*/
		
		// 사용자에게 id를 입력 받아서
		// 해당 id가 admin 이라면 관리자모드로 전환합니다 출력하고,
		// 아니면 일반회원 모드로 전환합니다 출력하기
		/*String id, admin;
		
		System.out.print("당신의 ID를 입력하시오 : ");
		id = sc.nextLine();
		
		admin = id.equals("admin") ? "관리자" : "일반회원";
		System.out.println(admin + "모드로 전환합니다.");*/
		
		// 사용자에게 나이를 입력받아서
		// 해당 나이가 10세 이상 30세 미만이라면 500원 그 외의 나이는 무료 라고 출력하기
		/*int age;
		String age_price;
		
		System.out.print("당신의 나이를 입력하시오 : ");
		age = Integer.parseInt(sc.nextLine());
		
		age_price = ((age >= 10) && (age < 30)) ? "500원" : "무료";
		System.out.println(age_price + "입니다");*/
		
		// 사용자에게 키와 몸무게를 입력받아서
		// 키가 190이 넘거나 몸무게가 100이 넘으면 탑승할 수 없습니다
		// 그 외의 경우에는 탑승 가능합니다 출력하기
		/*double height, weight;
		String boarding;
		
		System.out.print("당신의 키를 입력하시오 : ");
		height = Double.parseDouble(sc.nextLine());
		System.out.print("당신의 몸무게를 입력하시오 : ");
		weight = Double.parseDouble(sc.nextLine());
		
		boarding = ((height >= 190) || (weight >= 100)) ? "불가" : "가능";
		System.out.println("탑승 " + boarding);*/
	}
}
