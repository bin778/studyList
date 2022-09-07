package day07;

public class NestedForTask {
	public static void main(String[] args) {
		// *****
		// *****
		// *****
		// *****
		// *****
		// 겉에있는 for문 반복 횟수 : 행
		// 안쪽 for문 반복 횟수 : 열
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		// *
		// **
		// ***
		// ****
		// *****

		//       *
		//      ***
		//     *****
		//    *******
		//   *********
		//  ***********
		
		//       *
		//      * *
		//     *   *
		//    *     *
		//   *       *
		//  ***********
		
		// 구구단 1단부터 9단까지
		// 3단씩 출력하기
	}
}
