package day10;

public class ArraryTest2 {
	public static void main(String[] args) {
		
		int[] ar = new int[3];
		System.out.println("요소의 갯수 : " + ar.length);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(i + "번째방: " + ar[i]);
		}
		
		int [] ar2 = new int[3];
		int []ar3 = new int[3];
		int ar4[] = new int[3];
		
		String[] names = {"김철수", "홍길동", "박영희"};
		
		for(int i = 0; i < names.length; i++) {
			String a = names[i];
			System.out.println(a);
		}
		
		System.out.println("----------------");
		// for문, foreach문 향상된 for문
		// 1.5버전(5버전) 이후부터 추가될 문법
		// a라는 변수에는 반복을 하며 차레로 names 라는 배열 속에 있는
		// 요소가 대입하게 된다.
		for (String a : names) {
			System.out.println(a);
		}
	}
}
