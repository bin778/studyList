package stringTest;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
//		String msg = "apple juice is delicious";
//		
//		// charAt(�ε���) : ���ڿ����� �ε��� ��ġ�� �ִ� char ���� return
//		System.out.println(msg.charAt(6));
//		
//		// length() : ���ڿ��� ���̸� int�� return
//		System.out.println("���ڿ��� ����: " + msg.length());
//		
//		// indexOf(����)
//		// indexOf(���ڿ�) : �ش� ����/ ���ڿ��� �����ϴ� ��ġ �ε��� return
//		System.out.println(msg.indexOf('d'));
//		System.out.println(msg.indexOf("pl"));
//		
//		// indexOf(���ڿ�, ã��������ε���) : 
//		//		ã��������ε������� ����/ ���ڿ��� �����ϴ� ��ġ �ε��� return
//		System.out.println(msg.indexOf('e', 5));
//		
//		String msg = "apple juice is delicious";
//		System.out.println(msg.substring(5)); // 5���� ������
//		System.out.println(msg.substring(5, 10)); // 5���� 9����
//		
//		System.out.println(Arrays.toString(msg.split(" ")));
		
		// 1. ����ڿ��� ���ڿ��� �Է� �޾Ƽ�
		// �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�, �׿��� ���ڴ� �״�� �ٲپ� ����ϱ�
		Scanner sc = new Scanner(System.in);
//		String str;
//		String change = "";
//		
//		System.out.print("���ڿ� �Է� >> ");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
//				change += String.valueOf(str.charAt(i)).toUpperCase();
//			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
//				change += String.valueOf(str.charAt(i)).toLowerCase();
//			else
//				change += str.charAt(i);
//		}
//		
//		System.out.print("���ڿ� : " + change);
		
		// 2. ����, �뷡����, �����̸��� �޸��� ���еǾ� ���ٷ� �Էµȴ�
		// �̶� ������ ���� �������� 10���� ���Ͽ� ����϶�
		// �Է� >> 10,������,������
		// ��� >> 20,������,������
		String str;
		String Rank1, Song, Singer;
		int Rank2;
		
		System.out.println("����, �뷡����, �����̸� �Է� >> ");
		str = sc.nextLine();
		
		Rank1 = str.split(",")[0];
		Song = str.split(",")[1];
		Singer = str.split(",")[2];
		
		Rank2 = Integer.parseInt(Rank1) + 10;
		
		System.out.println(Rank2 + "," + Song + "," + Singer);
		
		//3. ����ڿ��� �ѱ۷� ���ڸ� �Է� �޾Ƽ�
		// ���ڷ� ����϶�
		// �Է� >> �ϰ��̻�
		// ��� >> 1024
//		String str;
//		String change = "";
//		
//		System.out.print("�ѱ۷� ���� �Է� >> ");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			switch (str.charAt(i)) {
//			case '��':
//				change += "0";
//				break;
//			case '��':
//				change += "1";
//				break;
//			case '��':
//				change += "2";
//				break;
//			case '��':
//				change += "3";
//				break;
//			case '��':
//				change += "4";
//				break;
//			case '��':
//				change += "5";
//				break;
//			case '��':
//				change += "6";
//				break;
//			case 'ĥ':
//				change += "7";
//				break;
//			case '��':
//				change += "8";
//				break;
//			case '��':
//				change += "9";
//				break;
//			default:
//				change += String.valueOf(str.charAt(i));
//			}
//		}
//		System.out.println(change);
		
	}
}
