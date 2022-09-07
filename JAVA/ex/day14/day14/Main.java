package day14;

import accessTest.AccessTest;

public class Main {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
//		at. 다른 패키지, 다른클래스에서는 public으로 설정된
		// 멤버들만 사용 가능하다
		
		int[] ar = {10, 20, 30};
		
		Student kim = new Student("김철수 ", 90, 80, 70);
		Student hong = new Student();
		
		kim.school = "고등학교";
			
		System.out.println(kim.school);
		System.out.println(hong.school);
		System.out.println(Student.school);
		
		Student.f();
		
		kim.show();
	}
}
