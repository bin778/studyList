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
			System.out.println("1.�α���");
			System.out.println("2.ȸ�� ����");
			System.out.println("3.����");
			System.out.print("���� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.print("id : ");
				String id = sc.nextLine();
				System.out.print("pw : ");
				String pw = sc.nextLine();
				
				// �迭�ӿ� ��ġ�ϴ� id�� pw�� ã�Ҵٸ� �α��� ����! ����ϱ�
				// ���� �α��� ���ж�� 
				// ���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ� ����ϱ�
				for (int i = 0; i < ar.length; i++) {
					if (id.equals(ar[i].getId()) && pw.equals(ar[i].getPw())) {
						System.out.println("�α��� ����!");
						break;
					}
					else if (i == ar.length - 1)
							System.out.println("���̵� �Ǵ� ��й�ȣ�� �ٸ��ϴ�");
				}
				
			}
			else if(choice == 2) {
				System.out.print("id : ");
				String id = sc.nextLine();
				
				// �ش� id�� ���� ȸ�� ������ ������ ���� ���
				// ---ȸ������---
				// id : aaa
				// pw : 1111
				// ���� : 20��
				// �������� �ʴ� id��� �������� �ʽ��ϴ� ����ϱ�
				boolean check = false;
				
				for (User a : ar) {
					if (id.equals(a.getId())) {
						check = true;
						System.out.println("---ȸ������---");
						System.out.println("id : " + a.getId());
						System.out.println("pw : " + a.getPw());
						System.out.println("���� : " + a.getAge() + "��");					
						break;
					}					
				}
				
				if (check == false)
					System.out.println("�������� �ʴ� ID�Դϴ�.");
				
//				for (int i = 0; i < ar.length; i++) {
//					if (id.equals(ar[i].getId())) {
//						check = true;
//						System.out.println("---ȸ������---");
//						System.out.println("id : " + ar[i].getId());
//						System.out.println("pw : " + ar[i].getPw());
//						System.out.println("���� : " + ar[i].getAge() + "��");					
//						break;
//					}
//				}
//				if (check == false)
//					System.out.println("�������� �ʴ� ID�Դϴ�.");
				
			}
			else if(choice == 3) {
				break;
			}
			else
				System.out.println("�ٽ��Է�");
			System.out.println();
		}
		
		
//		for(User a : ar) {
//			
//		}
		
		
	}
}
