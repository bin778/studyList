package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//nextLine()�޼ҵ�� Scanner Ŭ���� �ȿ� ��������ֱ� ������
		//nextLine()�޼ҵ�� ���� ���ؼ� Scanner Ŭ������ �غ�
		Scanner sc = new Scanner(System.in);//ScannerŬ������ sc��� �̸����� �θ��ڴ�
		//String name = "ddd";
		
		System.out.print("�̸� : ");
		// nextLine() : �ܼ�â���� �Է��� �ް�, �Է¹��� ���� StringŸ������ �޾ƿ´�
		// nextLine() �޼ҵ� ����� ����� String Ÿ���� ������ ġȯ�Ͽ� �����Ѵ�
//		System.out.println(sc.nextLine());
		String name = sc.nextLine();
		
		System.out.printf("%s�� ȯ���մϴ�.\n", name);
		//��󿱴��� ����� VIP�Դϴ�
		System.out.printf("%s���� ����� VIP�Դϴ�.\n", name);	
	}
}
