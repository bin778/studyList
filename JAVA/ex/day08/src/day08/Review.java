package day08;

public class Review {
	public static void main(String[] args) {		
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
				
		System.out.println();
		//       *
		//      ***
		//     *****
		//    *******
		//   *********
		//  ***********
				
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
				
		System.out.println();
		//       *
		//      * *
		//     *   *
		//    *     *
		//   *       *
		//  ***********
		
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1 || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
				
		System.out.println();
		// 구구단 1단부터 9단까지
		// 3단씩 출력하기
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + " X " + j + " = " + i * j + "\t");
			}
			System.out.println();	
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 4; j <= 6; j++) {
				System.out.print(i + " X " + j + " = " + i * j + "\t");
			}
			System.out.println();	
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 7; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j + "\t");
			}
			System.out.println();	
		}		
	}
}
