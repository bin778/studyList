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
		System.out.println(num1.intValue() == num3);// num1�� auto unboxing
		System.out.println(num1.equals(num3)); // num3 Integer�� auto boxing, Object��ĳ����
		
		// �ڽ� : �⺻�ڷ��� --> ��ü��
		// 10(int Ÿ�� ��) --> 10�� �������� ����ִ� ��ü
		new Integer(10);
		// 10�̳������� ����ִ� ��ü --> 10(int Ÿ�� ��)
		// intValue() �޼ҵ�
		num1.intValue(); // ��ڽ�
		
		// auto
		Integer n = 10; // auto boxing
		int unboxing = n;// auto unboxing
	}
}
