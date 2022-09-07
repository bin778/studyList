package wrapperTest;

class MyInteger{
	int value;
	public MyInteger(int value) {
		this.value = value;
	}
}

public class WrapperTest {
	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		int num3 = 10;
		int num4 = 10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));
		System.out.println(num3 == num4);
		System.out.println(num1.intValue() == num3);// num1이 auto unboxing
		System.out.println(num1.equals(num3)); // num3 Integer로 auto boxing, Object업캐스팅
		
		// 박싱 : 기본자료형 --> 객체로
		// 10(int 타입 값) --> 10이 내용으로 들어있는 객체
		new Integer(10);
		// 10이내용으로 들어있는 객체 --> 10(int 타입 값)
		// intValue() 메소드
		num1.intValue(); // 언박싱
		
		// auto
		Integer n = 10; // auto boxing
		int unboxing = n;// auto unboxing
	}
}
