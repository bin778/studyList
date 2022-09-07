package day09;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//랜덤한 int 값을 받아오는 메소드
		// 메소드 이름 : nextInt(), Random 클래스 안에 만들어져 있다
		Random r = new Random();
		//Scanner sc = new Scanner();
		
		//nextInt(int값): 0부터 int값-1 까지의 숫자중 랜덤한 int 값을 결과로 가져온다
		//nextInt()를 사용한 결과는 int타입의 값이다
		System.out.println(r.nextInt(10));
	}
}
