package day03;

public class CastingTest {
	public static void main(String[] args) {
		// 3 --> 3.0
		System.out.println((double)3);
		// 3.14 --> 3
		System.out.println((int)3.14);
		// 'A' --> int??
		System.out.println((int)'B');
		// int --> char
		System.out.println((char)97);
		
		// 10 --> "10"
		// String�� �⺻�ڷ����� �ƴ� Ŭ�����̴�
		// �޼ҵ带 ���ؼ� �ٲ���� �Ѵ�
//		System.out.println((String)10); (X)
		
		// int --> String
		// Integer Ŭ���� �ȿ� �ִ� toString()
		System.out.println(Integer.toString(10));
		String num1 = Integer.toString(10);
		
		// String --> int
		// Integer Ŭ���� �ȿ� �ִ� parseInt()
		System.out.println(Integer.parseInt("20"));
		int num2 = Integer.parseInt("20");
		
		// double --> String
		// Double Ŭ�����ȿ� �ִ� toString()
		System.out.println(Double.toString(3.14));
		String num3 = Double.toString(3.14);
		
		// String --> double
		// Double Ŭ�����ȿ� �ִ� parseDouble()
		System.out.println(Double.parseDouble("6.25"));
		double num4 = Double.parseDouble("6.25");
	}
}
