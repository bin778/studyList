package day21;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
//		String input, res = "";
		Scanner sc = new Scanner(System.in);
//		// 1. ����ڿ��� ���ڿ��� �Է� �޾Ƽ�
//		System.out.print("���ڿ� �Է� >> ");
//		input = sc.nextLine();
//		// �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�, �׿��� ���ڴ� �״�� �ٲپ� ����ϱ�
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			if(ch >= 'A' && ch <= 'Z') {
//				res += (char)(ch + 32);
//			}else if(ch >= 'a' && ch <= 'z') {
//				res += (char)(ch - 32);
//			}else {
//				res += ch;
//			}
//		}
//		System.out.println(res);
		
		// 2. ����, �뷡����, �����̸��� �޸��� ���еǾ� ���ٷ� �Էµȴ�
		// �̶� ������ ���� �������� 10���� ���Ͽ� ����϶�
		// �Է� >> 10,������,������
		// ��� >> 20,������,������
//		String input = sc.nextLine();
//		String[] temp = input.split(",");
//		// temp : {"10", "������", "������"}
//		temp[0] = Integer.parseInt(temp[0]) + 10 + "";
//		
//		// temp : {"20", "������", "������"}
//		// StringŬ���� �ȿ� �����ϴ� join�޼ҵ�
//		// String.join(�����ҹ��ڿ�, �迭)
//		System.out.println(String.join(",", temp));
//		System.out.println("----------------");		
//		String res = "";
//		for(int i = 0; i < temp.length; i++) {
//			if(i != temp.length - 1) {
//				res += temp[i] + ",";
//			}else {
//				res += temp[i];
//			}
//		}
//		System.out.println(res);
		
		//3. ����ڿ��� �ѱ۷� ���ڸ� �Է� �޾Ƽ�
		// ���ڷ� ����϶�
		// �Է� >> �ϰ��̻�
		// ��� >> 1024
		System.out.print("�Է� >> ");
		String input = sc.nextLine();
		
		String hangeul = "�����̻�����ĥ�ȱ�";
		
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			res += hangeul.indexOf(ch);
		}
		System.out.print("��� : " + res);
		
	}
}
