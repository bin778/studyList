package day09;

import java.util.Random;
import java.util.Scanner;

public class CoinNoraebang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, price = 500;
		int money, music = 0, change = 0;
		int score, total = 0, count = 0;
		double avg;
		
		while(true) {
			System.out.println("★☆환영합니다 Coin 노래방입니다☆★");
			System.out.println("1. 코인입력");
			System.out.println("2. 노래부르기");
			System.out.println("3. 노래실력 보기");
			System.out.println("4. 종료하기");
			System.out.print("입력 >> ");
			
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {// 코인입력
				System.out.print("금액입력 >> ");
				money = Integer.parseInt(sc.nextLine());
				
				// 사용자에게 부를 수 있는 노래 곡수와
				// 잔돈 출력해 주기
				if (money >= 0) {
					if (money >= price) {
						music += money / price;
						change = money % price;
						System.out.println("부를 수 있는 노래 : " + music + "곡");
						if (change != 0)
							System.out.println("잔돈 : " + change + "원을 반환합니다.");
					}
					else {
						System.out.println("500원 이상만 넣을 수 있습니다.");
						if (money != 0)
							System.out.println(money + "원을 반환합니다.");
					}
				}
				else
					System.out.println("잘못된 값입니다.");
			}
			else if (choice == 2) {// 노래부르기
				if (music <= 0)
					System.out.println("부를 수 있는 노래가 없습니다.");
				else {
					// 노래 곡수 차감
					music--;
					Random rand = new Random();
					score = rand.nextInt(11);
					System.out.println("당신의 노래 점수 : " + score);
					total += score;
					count++;
					if (score == 10) {
						music++;
						System.out.println("Wow! 가수해도 되겠어요^^");
						System.out.println("노래 한 곡 서비스!!");
					}
					else if (score >= 8)
						System.out.println("훌룡한 실력이군요~");
					else if (score >= 5)
						System.out.println("나쁘지는 않네요~");
					else if (score >= 1)
						System.out.println("좀 만 더 노오력해보세요~");
					else {
						System.out.println("God! 친구들을 웃겨보세요^^");
						if (music > 0) {
							music--;
							System.out.println("노래 한 곡 차감!!");
						}
						else
							System.out.println("노래가 없어서 차감은 하지 않겠습니다.");
					}
					System.out.println("남은 노래 : " + music + "곡");
				}
			}
			else if (choice == 3) {// 노래실력보기
				if (count > 0) {
					avg = (double)total / (double)count;
					System.out.println("당신이 부른 노래 횟수 : " + count + "곡");
					System.out.printf("당신의 노래 점수 : %.2f\n", avg);
				}
				else
					System.out.println("부른 노래가 없습니다.");
			}
			else if (choice == 4) {// 종료하기
				System.out.println("Coin 노래방을 종료합니다.");
				break;
			}
			else //잘못입력
				System.out.println("1~4까지 다시 입력하시오!");
			
			System.out.println();
			
		}
		
	}
}


