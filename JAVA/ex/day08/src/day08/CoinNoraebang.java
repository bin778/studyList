package day08;

import java.util.Scanner;

public class CoinNoraebang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("★☆환영합니다 Coin 노래방입니다☆★");
			System.out.println("1. 코인입력");
			System.out.println("2. 노래부르기");
			System.out.println("3. 노래실력 보기");
			System.out.println("4. 종료하기");
			System.out.print("입력 >> ");
			
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {// 코인입력
				
			}
			else if (choice == 2) {// 노래부르기
				
			}
			else if (choice == 3) {// 노래실력보기
				
			}
			else if (choice == 4) {// 종료하기
				break;
			}
			else //잘못입력
				System.out.println("다시입력하시오");
			
		}
		
	}
}
