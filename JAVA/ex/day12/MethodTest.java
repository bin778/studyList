package day12;

public class MethodTest {
	public static void printName(String name, int cnt) {
		
		for(int i = 0; i < 5; i++)
			System.out.println(name);
	}
	
	public static void main(String[] args) {
		MethodTest.printName("�ֿ���", 3);
		
		System.out.println("����,..,.");
		
		MethodTest.printName("��ö��", 4);
		
		System.out.println("���α׷� ������");
		
		MethodTest.printName("�迵��", 7);
		
		System.out.println(MethodTest.add(50, 40)/2);
		
		int num = MethodTest.add(10, 10);
		System.out.println(num);
		
		MethodTest.add(1.5, 1.2);
		
		MethodTest.f(10, "�ȳ�");
		MethodTest.f(10, "�ȳ�", "�ݰ���");
		MethodTest.f(10, "�ȳ�", "�ݰ���", "������");
	}
	
	// ���� �Ű����� ����� ��
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
		System.out.println("doubleŸ���� �Ѱܹ��� �޼ҵ�");
	}
	
	// �� ���� ���� ���ϴ� �޼ҵ�
	public static int add(int a, int b) {
		System.out.println("�� ���� ���ϰڽ��ϴ�");
		System.out.println("�� ���� ���� ��� ���� " + (a+b) +"�Դϴ�");
		return a + b;
	}
}
