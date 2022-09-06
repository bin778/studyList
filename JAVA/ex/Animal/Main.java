package day17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Animal avatar = null;
		
		//게임화면 구현
		System.out.println("게임시작");
		
		System.out.println("캐릭터를 선택하시오");
		System.out.println("1. 강아지");
		System.out.println("2. 고양이");
		System.out.println("3. 호랑이");
		System.out.print("입력 >> ");
		choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			avatar = new Dog(); // 업캐스팅
		} else if(choice == 2) {
			avatar = new Cat(); // 업캐스팅
		} else {
			avatar = new Tiger(); // 업캐스팅
		}
		while(true) {
			System.out.println("1. 먹기");
			System.out.println("2. 산책가기");
			System.out.println("3. 휴식하기");
			System.out.println("4. 종료");
			System.out.print("입력 >> ");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.rest();
			}else if(choice == 4) {
				if(avatar instanceof Cat) {// avatar에 Cat 타입이 업캐스팅되어있다면
					((Cat)avatar).onlyCat();
				}			
				break;
			}else {
				System.out.println("잘못입력됨");
			}
		}
	}
}
