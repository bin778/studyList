package day14;

import accessTest.AccessTest;

public class Main {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
//		at. �ٸ� ��Ű��, �ٸ�Ŭ���������� public���� ������
		// ����鸸 ��� �����ϴ�
		
		int[] ar = {10, 20, 30};
		
		Student kim = new Student("��ö�� ", 90, 80, 70);
		Student hong = new Student();
		
		kim.school = "����б�";
			
		System.out.println(kim.school);
		System.out.println(hong.school);
		System.out.println(Student.school);
		
		Student.f();
		
		kim.show();
	}
}
