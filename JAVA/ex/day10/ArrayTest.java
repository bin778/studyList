package day10;

public class ArrayTest {
	public static void main(String[] args) {
		// 80, 90, 10이 요소로 들어있는 배열 ar 선언 및 초기화 하기
		int[] ar = {80, 90, 10};
		
		System.out.println(ar);
		
		// 배열.length : 해당 배열의 요소의 갯수가 사용 결과이다(사용 결과는 int 타입 값)
		System.out.println("배열의 길이: " + ar.length);
		
		ar[0] = 100;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]); 인덱스 범위 벗어나면 오류 발생
		
		
	}
}
