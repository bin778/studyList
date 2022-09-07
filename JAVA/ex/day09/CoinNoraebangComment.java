package day09;

import java.util.Random;
import java.util.Scanner;

public class CoinNoraebangComment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용 함수
		
		int choice, price = 500; // 선택, 곡 가격 변수 초기화
		int money, music = 0, change = 0; // 잔액, 곡수, 거스름돈 변수 초기화
		int score, total = 0, count = 0; // 노래 점수, 총점수, 부른 횟수 변수 초기화
		double avg;
		
		while(true) {
			// Coin 노래방 안내판
			System.out.println("★☆환영합니다 Coin 노래방입니다☆★");
			System.out.println("1. 코인입력");
			System.out.println("2. 노래부르기");
			System.out.println("3. 노래실력 보기");
			System.out.println("4. 종료하기");
			System.out.print("입력 >> ");
			
			// 사용자에게 choice를 입력받아서 1~4 까지 선택
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) { // 1을 선택할경우
				System.out.print("금액입력 >> "); // 사용자에게 잔액을 입력받는다.
				money = Integer.parseInt(sc.nextLine());
				
				// 잔액이 0원이상인 경우
				if (money >= 0) {
					// 잔액이 곡 가격(500원)보다 클 경우
					if (money >= price) {
						// 잔액과 가격을 나누어서 곡수(music)에 대입. 곡수(music)는 누적된다(+=)
						music += money / price;
						// 잔액과 가격의 나머지를 계산 거스름돈(change)에 대입
						change = money % price;
						// 현재 부를 수 있는 곡수 출력
						System.out.println("부를 수 있는 노래 : " + music + "곡");
						// 잔액이 0원이 아니면 거스름된 출력
						if (change != 0)
							System.out.println("잔돈 : " + change + "원을 반환합니다.");
					}
					// 잔액이 곡 가격(500원)보다 작으면 500원이상만 넣을 수 있다고 출력
					else {
						System.out.println("500원 이상만 넣을 수 있습니다.");
						// 잔액이 0원이 아니면 잔액을 반환
						if (money != 0)
							System.out.println(money + "원을 반환합니다.");
					}
				}
				// 잔액이 -인 경우 잘못된 값이라고 출력
				else
					System.out.println("잘못된 값입니다.");
			}
			// 2를 선택할경우
			else if (choice == 2) {
				if (music <= 0) // 곡 개수(music)가 없으면 부를 수 있는 노래가 없다고 출력
					System.out.println("부를 수 있는 노래가 없습니다.");
				else {
					// 곡 개수(music) 차감
					music--;
					// 랜덤 난수 생성
					Random rand = new Random();
					// 점수(score)에 1~10까지 랜덤 정수 대입
					score = rand.nextInt(11);
					// 랜덤 정수를 이용하여 점수(score)출력
					System.out.println("당신의 노래 점수 : " + score);
					// 곡을 부를 때마다 점수가 합산된다(+=)
					total += score;
					// 곡을 부를 때마다 부른 횟수가 증가한다
					count++;
					if (score == 10) { // 10점이면 곡 개수(music) 추가
						music++;
						System.out.println("Wow! 가수해도 되겠어요^^");
						System.out.println("노래 한 곡 서비스!!");
					}
					else if (score >= 8) // 8점이상 경우
						System.out.println("훌룡한 실력이군요~");
					else if (score >= 5) // 5점이상 경우
						System.out.println("나쁘지는 않네요~");
					else if (score >= 1) // 1점일 경우
						System.out.println("좀 만 더 노오력해보세요~");
					else { // 0점일경우
						System.out.println("God! 친구들을 웃겨보세요^^");
						// 곡 개수(music)가 남아있으면 차감O, 없으면 차감X
						if (music > 0) {
							music--;
							System.out.println("노래 한 곡 차감!!");
						}
						else
							System.out.println("노래가 없어서 차감은 하지 않겠습니다.");
					}
					// 결과 메시지 출력 후 사용자에게 남은 횟수(music)를 출력한다
					System.out.println("남은 노래 : " + music + "곡");
				}
			}
			else if (choice == 3) { // 3을 선택할경우
				// 부른 횟수가 1회이상 일경우
				// 실수형으로 바꿔서 총점과 부른 횟수를 나누어서 평균을 계산
				if (count > 0) {
					avg = (double)total / (double)count;
					// 부른 횟수와 노래 평균 점수 출력
					System.out.println("당신이 부른 노래 횟수 : " + count + "곡");
					System.out.printf("당신의 노래 점수 : %.2f\n", avg);
				}
				// 부른 횟수가 없으면 부른 노래가 없다고 출력
				else
					System.out.println("부른 노래가 없습니다.");
			}
			else if (choice == 4) { 
				// 4를 선택하면 Coin 노래방을 종료한다고 메시지를 출력하고 프로그램 종료
				System.out.println("Coin 노래방을 종료합니다.");
				break;
			}
			else // 1~4 이외의 번호를 입력하면 다시 입력
				System.out.println("1~4까지 다시 입력하시오!");
			// 가독성을 위해 한 칸 줄바꿈
			System.out.println();
			
		}
		
	}
}