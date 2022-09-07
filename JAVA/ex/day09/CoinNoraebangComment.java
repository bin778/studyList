package day09;

import java.util.Random;
import java.util.Scanner;

public class CoinNoraebangComment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ��� �Լ�
		
		int choice, price = 500; // ����, �� ���� ���� �ʱ�ȭ
		int money, music = 0, change = 0; // �ܾ�, ���, �Ž����� ���� �ʱ�ȭ
		int score, total = 0, count = 0; // �뷡 ����, ������, �θ� Ƚ�� ���� �ʱ�ȭ
		double avg;
		
		while(true) {
			// Coin �뷡�� �ȳ���
			System.out.println("�ڡ�ȯ���մϴ� Coin �뷡���Դϴ١١�");
			System.out.println("1. �����Է�");
			System.out.println("2. �뷡�θ���");
			System.out.println("3. �뷡�Ƿ� ����");
			System.out.println("4. �����ϱ�");
			System.out.print("�Է� >> ");
			
			// ����ڿ��� choice�� �Է¹޾Ƽ� 1~4 ���� ����
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) { // 1�� �����Ұ��
				System.out.print("�ݾ��Է� >> "); // ����ڿ��� �ܾ��� �Է¹޴´�.
				money = Integer.parseInt(sc.nextLine());
				
				// �ܾ��� 0���̻��� ���
				if (money >= 0) {
					// �ܾ��� �� ����(500��)���� Ŭ ���
					if (money >= price) {
						// �ܾװ� ������ ����� ���(music)�� ����. ���(music)�� �����ȴ�(+=)
						music += money / price;
						// �ܾװ� ������ �������� ��� �Ž�����(change)�� ����
						change = money % price;
						// ���� �θ� �� �ִ� ��� ���
						System.out.println("�θ� �� �ִ� �뷡 : " + music + "��");
						// �ܾ��� 0���� �ƴϸ� �Ž����� ���
						if (change != 0)
							System.out.println("�ܵ� : " + change + "���� ��ȯ�մϴ�.");
					}
					// �ܾ��� �� ����(500��)���� ������ 500���̻� ���� �� �ִٰ� ���
					else {
						System.out.println("500�� �̻� ���� �� �ֽ��ϴ�.");
						// �ܾ��� 0���� �ƴϸ� �ܾ��� ��ȯ
						if (money != 0)
							System.out.println(money + "���� ��ȯ�մϴ�.");
					}
				}
				// �ܾ��� -�� ��� �߸��� ���̶�� ���
				else
					System.out.println("�߸��� ���Դϴ�.");
			}
			// 2�� �����Ұ��
			else if (choice == 2) {
				if (music <= 0) // �� ����(music)�� ������ �θ� �� �ִ� �뷡�� ���ٰ� ���
					System.out.println("�θ� �� �ִ� �뷡�� �����ϴ�.");
				else {
					// �� ����(music) ����
					music--;
					// ���� ���� ����
					Random rand = new Random();
					// ����(score)�� 1~10���� ���� ���� ����
					score = rand.nextInt(11);
					// ���� ������ �̿��Ͽ� ����(score)���
					System.out.println("����� �뷡 ���� : " + score);
					// ���� �θ� ������ ������ �ջ�ȴ�(+=)
					total += score;
					// ���� �θ� ������ �θ� Ƚ���� �����Ѵ�
					count++;
					if (score == 10) { // 10���̸� �� ����(music) �߰�
						music++;
						System.out.println("Wow! �����ص� �ǰھ��^^");
						System.out.println("�뷡 �� �� ����!!");
					}
					else if (score >= 8) // 8���̻� ���
						System.out.println("�Ƿ��� �Ƿ��̱���~");
					else if (score >= 5) // 5���̻� ���
						System.out.println("�������� �ʳ׿�~");
					else if (score >= 1) // 1���� ���
						System.out.println("�� �� �� ������غ�����~");
					else { // 0���ϰ��
						System.out.println("God! ģ������ ���ܺ�����^^");
						// �� ����(music)�� ���������� ����O, ������ ����X
						if (music > 0) {
							music--;
							System.out.println("�뷡 �� �� ����!!");
						}
						else
							System.out.println("�뷡�� ��� ������ ���� �ʰڽ��ϴ�.");
					}
					// ��� �޽��� ��� �� ����ڿ��� ���� Ƚ��(music)�� ����Ѵ�
					System.out.println("���� �뷡 : " + music + "��");
				}
			}
			else if (choice == 3) { // 3�� �����Ұ��
				// �θ� Ƚ���� 1ȸ�̻� �ϰ��
				// �Ǽ������� �ٲ㼭 ������ �θ� Ƚ���� ����� ����� ���
				if (count > 0) {
					avg = (double)total / (double)count;
					// �θ� Ƚ���� �뷡 ��� ���� ���
					System.out.println("����� �θ� �뷡 Ƚ�� : " + count + "��");
					System.out.printf("����� �뷡 ���� : %.2f\n", avg);
				}
				// �θ� Ƚ���� ������ �θ� �뷡�� ���ٰ� ���
				else
					System.out.println("�θ� �뷡�� �����ϴ�.");
			}
			else if (choice == 4) { 
				// 4�� �����ϸ� Coin �뷡���� �����Ѵٰ� �޽����� ����ϰ� ���α׷� ����
				System.out.println("Coin �뷡���� �����մϴ�.");
				break;
			}
			else // 1~4 �̿��� ��ȣ�� �Է��ϸ� �ٽ� �Է�
				System.out.println("1~4���� �ٽ� �Է��Ͻÿ�!");
			// �������� ���� �� ĭ �ٹٲ�
			System.out.println();
			
		}
		
	}
}