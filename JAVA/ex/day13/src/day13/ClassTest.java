package day13;

import java.util.Arrays;

class Student {// ���ڿ�(�̸�) 1��, intŸ�� 3��(��,��,�� ����)
	String name;
	int kor;
	int eng;
	int math;
	
	public void show() {
		System.out.println(name + " ���� ����");
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
	}
}

public class ClassTest {
	
	public static void printStudent(Student s) {
		System.out.println(s.name + " ���� ����");
		System.out.println("�������� : " + s.kor);
		System.out.println("�������� : " + s.eng);
		System.out.println("�������� : " + s.math);
	}
	
	public static void main(String[] args) {
		
		// kim : �������� ��ü object // �ν��Ͻ� instance
		// Student() : ��ü(�ν��Ͻ�)�� �������ִ� ���
		// new : ������, ������ ��ü�� ���޸𸮿� �Ҵ��ϴ� ���
		Student kim = new Student(); // instantiate, �ν��Ͻ�ȭ, ��üȭ
		// �ڿ���, ���� : 80, ���� : 75, ���� : 100
		Student park = new Student();
		
		park.name = "�ڿ���";
		park.kor = 80;
		park.eng = 100;
		park.math = 75;
		
//		Student s2 = kim;
//		new Student().kor = 100;
		System.out.println(new Student().kor);
		
		//kim �ȿ��ִ� kor ������ ����ִ� ���� 100���� �����ϱ�
		kim.name = "��ö��";
		kim.kor = 100;
		kim.eng = 80;
		kim.math = 70;
		
		kim.show();
		park.show();
		
//		s2.name = "����";
//		ClassTest.printStudent(kim);
//		ClassTest.printStudent(park);
//		System.out.println(kim.name);
//		System.out.println(kim.kor);
//		System.out.println(kim.eng);
//		System.out.println(kim.math);
//		
//		System.out.println(park.name + " ���� ����");
//		System.out.println("�������� : " + park.kor);
//		System.out.println("�������� : " + park.eng);
//		System.out.println("�������� : " + park.math);
//		System.out.println("-----");
//		System.out.println(s2.name);
		int[] ar = new int[3];
		ar[1] = 100;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		// �迭�� ������ ����ϴ� �Լ�
		// ��� ���� import java.util.Arrays; ����
		System.out.println(Arrays.toString(ar)); 
	}
}
