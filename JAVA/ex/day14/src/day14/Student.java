package day14;

public class Student {
	// ����ƽ ����, ��������, 
	static String school; // Ŭ���� ����
	
	String name;// �ν��Ͻ� ����
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}
	
	// �ʱ�ȭ ������
	public Student(String a, int b, int c, int d) {
		this.name = a;
		this.kor = b;
		this.eng = c;
		this.math = d;
	}
	
	// ��� �ν��Ͻ����� �����ϰ� �����ϴ� �޼ҵ�
	public static void f() {
		System.out.println("����ƽ �޼ҵ�");
		// �ν��Ͻ����� �޶� �ν��Ͻ� ������ ����� �� ����
//		System.out.println(name);
	}
	
	public void show() {
		System.out.println(name + "�л�����");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);		
	}
}
