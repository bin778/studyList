package day13;

import java.util.Arrays;

class Student {// 문자열(이름) 1개, int타입 3개(국,영,수 점수)
	String name;
	int kor;
	int eng;
	int math;
	
	public void show() {
		System.out.println(name + " 점수 정보");
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
	}
}

public class ClassTest {
	
	public static void printStudent(Student s) {
		System.out.println(s.name + " 점수 정보");
		System.out.println("국어점수 : " + s.kor);
		System.out.println("영어점수 : " + s.eng);
		System.out.println("수학점수 : " + s.math);
	}
	
	public static void main(String[] args) {
		
		// kim : 참조변수 객체 object // 인스턴스 instance
		// Student() : 객체(인스턴스)를 생성해주는 기능
		// new : 연산자, 생성된 객체를 힙메모리에 할당하는 기능
		Student kim = new Student(); // instantiate, 인스턴스화, 객체화
		// 박영희, 국어 : 80, 수학 : 75, 영어 : 100
		Student park = new Student();
		
		park.name = "박영희";
		park.kor = 80;
		park.eng = 100;
		park.math = 75;
		
//		Student s2 = kim;
//		new Student().kor = 100;
		System.out.println(new Student().kor);
		
		//kim 안에있는 kor 변수에 들어있는 값을 100으로 수정하기
		kim.name = "김철수";
		kim.kor = 100;
		kim.eng = 80;
		kim.math = 70;
		
		kim.show();
		park.show();
		
//		s2.name = "수정";
//		ClassTest.printStudent(kim);
//		ClassTest.printStudent(park);
//		System.out.println(kim.name);
//		System.out.println(kim.kor);
//		System.out.println(kim.eng);
//		System.out.println(kim.math);
//		
//		System.out.println(park.name + " 점수 정보");
//		System.out.println("국어점수 : " + park.kor);
//		System.out.println("영어점수 : " + park.eng);
//		System.out.println("수학점수 : " + park.math);
//		System.out.println("-----");
//		System.out.println(s2.name);
		int[] ar = new int[3];
		ar[1] = 100;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		// 배열의 내용을 출력하는 함수
		// 사용 전에 import java.util.Arrays; 선언
		System.out.println(Arrays.toString(ar)); 
	}
}
