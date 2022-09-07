package day12;

import java.util.Scanner;

public class MethodTask {
	// �Ű������� charŸ���� ���� �Ѱܹ޾Ƽ�
	// �ش� charŸ�� ���� �빮�ڶ�� �ҹ��ڷ� �ٲٰ�,
	// �ҹ��ڶ�� �빮�ڷ� �ٲٰ�,
	// �׿��� ���ڶ�� �׳� �״�� ���δ� �޼ҵ�
	public static char ChangeLetter(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return (char)(ch + 32);
		else if
			(ch >= 'a' && ch <= 'z')
			return (char)(ch - 32);
		else
			return ch;
	}
		
	// �Ű������� intŸ�Կ�Ұ� ����ִ� �迭�� �޾ƿͼ�
	// �ش� �迭 ������� ������ִ� �޼ҵ� �����
	public static void printAr(int[] target) {
		System.out.print("[");
		for (int i = 0; i < target.length; i++) {
			if(i == target.length - 1)
				System.out.print(target[i]);
			else
				System.out.print(target[i] + ", ");
		}
		System.out.print("]");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		int[] ar1 = {10, 30, 5};
		int[] ar2 = {1, 2 ,5, 7};
		
		System.out.print("���� �Է� >> ");
		ch = sc.next().charAt(0); // ���� �Է��ϴ� �Լ�
		
		System.out.println(ChangeLetter(ch));
		
		printAr(ar1);
		printAr(ar2);
	}
}
