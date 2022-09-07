package day15;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		User u1 = new User("1234", "abc123", 10 );
//		User u2 = new User("5678", "def123", 15 );
//		User u3 = new User("1111", "aaa", 20 );
		User[] ar = {
					new User("1234", "abc123", 10),
					new User("5678", "def123", 15),
					new User("1111", "aaa", 20)
					};
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원 정보");
			System.out.println("3.종료");
			System.out.print("선택 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.print("id : ");
				String id = sc.nextLine();
				System.out.print("pw : ");
				String pw = sc.nextLine();
				
				// 배열속에 일치하는 id와 pw를 찾았다면 로그인 성공! 출력하기
				// 만약 로그인 실패라면 
				// 아이디 또는 비밀번호가 다릅니다 출력하기
				for (int i = 0; i < ar.length; i++) {
					if (id.equals(ar[i].getId()) && pw.equals(ar[i].getPw())) {
						System.out.println("로그인 성공!");
						break;
					}
					else if (i == ar.length - 1)
							System.out.println("아이디 또는 비밀번호가 다릅니다");
				}
				
			}
			else if(choice == 2) {
				System.out.print("id : ");
				String id = sc.nextLine();
				
				// 해당 id를 가진 회원 정보를 다음과 같이 출력
				// ---회원정보---
				// id : aaa
				// pw : 1111
				// 나이 : 20살
				// 존재하지 않는 id라면 존재하지 않습니다 출력하기
				boolean check = false;
				
				for (User a : ar) {
					if (id.equals(a.getId())) {
						check = true;
						System.out.println("---회원정보---");
						System.out.println("id : " + a.getId());
						System.out.println("pw : " + a.getPw());
						System.out.println("나이 : " + a.getAge() + "살");					
						break;
					}					
				}
				
				if (check == false)
					System.out.println("존재하지 않는 ID입니다.");
				
//				for (int i = 0; i < ar.length; i++) {
//					if (id.equals(ar[i].getId())) {
//						check = true;
//						System.out.println("---회원정보---");
//						System.out.println("id : " + ar[i].getId());
//						System.out.println("pw : " + ar[i].getPw());
//						System.out.println("나이 : " + ar[i].getAge() + "살");					
//						break;
//					}
//				}
//				if (check == false)
//					System.out.println("존재하지 않는 ID입니다.");
				
			}
			else if(choice == 3) {
				break;
			}
			else
				System.out.println("다시입력");
			System.out.println();
		}
		
		
//		for(User a : ar) {
//			
//		}
		
		
	}
}
