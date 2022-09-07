package day21;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {10, 20, 30};
		// 사용자에게 인덱스번호와 나눌 값을 입력받아서
		// ar 배열의 인덱스에 존재하는 요소를 값으로 나눈 몫을 출력하는
		// 프로그램	
		try {
			System.out.print("인덱스 >> ");
			int idx = Integer.parseInt(sc.nextLine());
			System.out.print("나눌값 >> ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("결과 : " + ar[idx] / num);
		}catch(ArrayIndexOutOfBoundsException e) {
			// e는 try 영역에서 발생한 ArrayIndexOutOfBoundsException 타입의 객체를 받아온다
			System.out.println("인덱스 잘못 설정됨");
			// getMessage() 라는 메소드는 발생한 예외 객체의 부연설명을 String타입으로
			// 받아오는 메소드
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없음");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하시오");
		}catch(Exception e) {
			// 자바의 모든 예외는 Exception을 상속받아 만들어져있기에
			// 결국에는 이 곳으로 오게 될 것
			System.out.println("오류발생함");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("오류가 발생하든 안하든 무조건 실행되는 영역");
		}
		
		System.out.println("프로그램 정상 종료됨");
	}
}
