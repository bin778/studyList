package day17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Animal avatar = null;
		
		//����ȭ�� ����
		System.out.println("���ӽ���");
		
		System.out.println("ĳ���͸� �����Ͻÿ�");
		System.out.println("1. ������");
		System.out.println("2. �����");
		System.out.println("3. ȣ����");
		System.out.print("�Է� >> ");
		choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			avatar = new Dog(); // ��ĳ����
		} else if(choice == 2) {
			avatar = new Cat(); // ��ĳ����
		} else {
			avatar = new Tiger(); // ��ĳ����
		}
		while(true) {
			System.out.println("1. �Ա�");
			System.out.println("2. ��å����");
			System.out.println("3. �޽��ϱ�");
			System.out.println("4. ����");
			System.out.print("�Է� >> ");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.rest();
			}else if(choice == 4) {
				if(avatar instanceof Cat) {// avatar�� Cat Ÿ���� ��ĳ���õǾ��ִٸ�
					((Cat)avatar).onlyCat();
				}			
				break;
			}else {
				System.out.println("�߸��Էµ�");
			}
		}
	}
}
