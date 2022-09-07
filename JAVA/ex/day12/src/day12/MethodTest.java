package day12;

public class MethodTest {
	public static void printName(String name, int cnt) {
		
		for(int i = 0; i < 5; i++)
			System.out.println(name);
	}
	
	public static void main(String[] args) {
		MethodTest.printName("최영빈", 3);
		
		System.out.println("개발,..,.");
		
		MethodTest.printName("김철수", 4);
		
		System.out.println("프로그램 개발중");
		
		MethodTest.printName("김영희", 7);
		
		System.out.println(MethodTest.add(50, 40)/2);
		
		int num = MethodTest.add(10, 10);
		System.out.println(num);
		
		MethodTest.add(1.5, 1.2);
		
		MethodTest.f(10, "안녕");
		MethodTest.f(10, "안녕", "반가워");
		MethodTest.f(10, "안녕", "반가워", "ㅇㅇㅇ");
	}
	
	// 가변 매개변수 만드는 법
	public static void f(int b, String... a) {
		for (String v : a) {
			System.out.println(v);
		}
		System.out.println("---------");
	}
	
//	public static int add(double a, double b) {
//		
//	}
//	public static void add(double num1, double num2) {
//	}
	
	public static void add(double a, double b) {
		System.out.println("double타입을 넘겨받은 메소드");
	}
	
	// 두 개의 수를 더하는 메소드
	public static int add(int a, int b) {
		System.out.println("두 수를 더하겠습니다");
		System.out.println("두 수를 더한 결과 값은 " + (a+b) +"입니다");
		return a + b;
	}
}
