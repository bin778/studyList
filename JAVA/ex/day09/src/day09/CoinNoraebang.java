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
			System.out.println("�ڡ�ȯ���մϴ� Coin �뷡���Դϴ١١�");
			System.out.println("1. �����Է�");
			System.out.println("2. �뷡�θ���");
			System.out.println("3. �뷡�Ƿ� ����");
			System.out.println("4. �����ϱ�");
			System.out.print("�Է� >> ");
			
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {// �����Է�
				System.out.print("�ݾ��Է� >> ");
				money = Integer.parseInt(sc.nextLine());
				
				// ����ڿ��� �θ� �� �ִ� �뷡 �����
				// �ܵ� ����� �ֱ�
				if (money >= 0) {
					if (money >= price) {
						music += money / price;
						change = money % price;
						System.out.println("�θ� �� �ִ� �뷡 : " + music + "��");
						if (change != 0)
							System.out.println("�ܵ� : " + change + "���� ��ȯ�մϴ�.");
					}
					else {
						System.out.println("500�� �̻� ���� �� �ֽ��ϴ�.");
						if (money != 0)
							System.out.println(money + "���� ��ȯ�մϴ�.");
					}
				}
				else
					System.out.println("�߸��� ���Դϴ�.");
			}
			else if (choice == 2) {// �뷡�θ���
				if (music <= 0)
					System.out.println("�θ� �� �ִ� �뷡�� �����ϴ�.");
				else {
					// �뷡 ��� ����
					music--;
					Random rand = new Random();
					score = rand.nextInt(11);
					System.out.println("����� �뷡 ���� : " + score);
					total += score;
					count++;
					if (score == 10) {
						music++;
						System.out.println("Wow! �����ص� �ǰھ��^^");
						System.out.println("�뷡 �� �� ����!!");
					}
					else if (score >= 8)
						System.out.println("�Ƿ��� �Ƿ��̱���~");
					else if (score >= 5)
						System.out.println("�������� �ʳ׿�~");
					else if (score >= 1)
						System.out.println("�� �� �� ������غ�����~");
					else {
						System.out.println("God! ģ������ ���ܺ�����^^");
						if (music > 0) {
							music--;
							System.out.println("�뷡 �� �� ����!!");
						}
						else
							System.out.println("�뷡�� ��� ������ ���� �ʰڽ��ϴ�.");
					}
					System.out.println("���� �뷡 : " + music + "��");
				}
			}
			else if (choice == 3) {// �뷡�Ƿº���
				if (count > 0) {
					avg = (double)total / (double)count;
					System.out.println("����� �θ� �뷡 Ƚ�� : " + count + "��");
					System.out.printf("����� �뷡 ���� : %.2f\n", avg);
				}
				else
					System.out.println("�θ� �뷡�� �����ϴ�.");
			}
			else if (choice == 4) {// �����ϱ�
				System.out.println("Coin �뷡���� �����մϴ�.");
				break;
			}
			else //�߸��Է�
				System.out.println("1~4���� �ٽ� �Է��Ͻÿ�!");
			
			System.out.println();
			
		}
		
	}
}


