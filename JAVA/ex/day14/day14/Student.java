package day14;

public class Student {
	// 스태틱 변수, 정적변수, 
	static String school; // 클래스 변수
	
	String name;// 인스턴스 변수
	int kor;
	int eng;
	int math;
	
	public Student() {
		
	}
	
	// 초기화 생성자
	public Student(String a, int b, int c, int d) {
		this.name = a;
		this.kor = b;
		this.eng = c;
		this.math = d;
	}
	
	// 모든 인스턴스에서 동일하게 동작하는 메소드
	public static void f() {
		System.out.println("스태틱 메소드");
		// 인스턴스마다 달라서 인스턴스 변수는 사용할 수 없다
//		System.out.println(name);
	}
	
	public void show() {
		System.out.println(name + "학생정보");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);		
	}
}
