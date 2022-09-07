package day03;

public class VaribleTest {
	public static void main(String[] args) {
		int num; // 변수의 선언(저장공간)
		num = 10;// 저장공간 초기화
		
		System.out.println(num);// (값)
		
		//int num; 변수는 같은 영역에서는 같은 이름으로 만들 수 없다
		num = 100; // 값 대입(초기화x)
		System.out.println(num);
		
		double a;
		a = 3.14; // 초기화 : 변수를 선언하고 최초로 값을 대입하는 행위
		System.out.println(a);// 변수는 초기화가 되어있지 않으면 사용할 수 없다
		
		// 변수에다가 본인 이름 세글자를 저장한 후, 출력하시오
		String name = "최영빈"; // 선언과 초기화를 동시에
		System.out.println(name);
		
	}
}