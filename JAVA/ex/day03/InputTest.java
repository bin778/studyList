package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//nextLine()메소드는 Scanner 클래스 안에 만들어져있기 때문에
		//nextLine()메소드는 쓰기 위해서 Scanner 클래스를 준비
		Scanner sc = new Scanner(System.in);//Scanner클래스를 sc라는 이름으로 부르겠다
		//String name = "ddd";
		
		System.out.print("이름 : ");
		// nextLine() : 콘솔창에서 입력을 받고, 입력받은 값을 String타입으로 받아온다
		// nextLine() 메소드 사용한 결과는 String 타입의 값으로 치환하여 생각한다
//		System.out.println(sc.nextLine());
		String name = sc.nextLine();
		
		System.out.printf("%s님 환영합니다.\n", name);
		//배상엽님의 등급은 VIP입니다
		System.out.printf("%s님의 등급은 VIP입니다.\n", name);	
	}
}
