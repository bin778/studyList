package day02;

public class PrintTest {
	public static void main(String[] args) {
		// \" : 문자열 안에서 "를 표현
		System.out.println("나는 말했다 \"배고프다\"라고");
		
		// \\ : 문자열 안에서 \를 표현
		System.out.println("역슬래시 모양은 \\입니다");
		
		// \n : 문자열 안에서 엔터를 표현한다
		System.out.println("오늘은\n화요일");
		
		// \t : 문자열 안에서 Tab을 표현한다
		System.out.println("껌\t100원\n과자\t1000원");
		
		// print() 메소드
		System.out.print("안녕하세요");
		System.out.print("반갑습니다\n");
		
		// printf() 메소드
		System.out.printf("%d년 %-2d월\n", 2022, 7);
		System.out.printf("원주율은 %-10.2f입니다\n", 3.14);
		System.out.printf("나의 학점은 %-9c입니다\n", 'A');
		System.out.printf("나의 이름은은 %-7s입니다\n", "최영빈");
		
		
	}
}
