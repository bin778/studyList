package day08;

import java.util.Scanner;

public class CoinNoraebang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("�ڡ�ȯ���մϴ� Coin �뷡���Դϴ١١�");
			System.out.println("1. �����Է�");
			System.out.println("2. �뷡�θ���");
			System.out.println("3. �뷡�Ƿ� ����");
			System.out.println("4. �����ϱ�");
			System.out.print("�Է� >> ");
			
			choice = Integer.parseInt(sc.nextLine());
			
			if (choice == 1) {// �����Է�
				
			}
			else if (choice == 2) {// �뷡�θ���
				
			}
			else if (choice == 3) {// �뷡�Ƿº���
				
			}
			else if (choice == 4) {// �����ϱ�
				break;
			}
			else //�߸��Է�
				System.out.println("�ٽ��Է��Ͻÿ�");
			
		}
		
	}
}
