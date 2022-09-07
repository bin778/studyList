package day11;

public class MethodTest {
	public static void printName() {
		for(int i = 0; i < 5; i++) {
			System.out.println("최영빈");
		}
	}
	
	public static void main(String[] args) {
		MethodTest.printName();
		System.out.println("프로그램 개발중....");
		MethodTest.printName();		
	}
	
}