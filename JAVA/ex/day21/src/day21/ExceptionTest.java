package day21;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {10, 20, 30};
		// ����ڿ��� �ε�����ȣ�� ���� ���� �Է¹޾Ƽ�
		// ar �迭�� �ε����� �����ϴ� ��Ҹ� ������ ���� ���� ����ϴ�
		// ���α׷�	
		try {
			System.out.print("�ε��� >> ");
			int idx = Integer.parseInt(sc.nextLine());
			System.out.print("������ >> ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("��� : " + ar[idx] / num);
		}catch(ArrayIndexOutOfBoundsException e) {
			// e�� try �������� �߻��� ArrayIndexOutOfBoundsException Ÿ���� ��ü�� �޾ƿ´�
			System.out.println("�ε��� �߸� ������");
			// getMessage() ��� �޼ҵ�� �߻��� ���� ��ü�� �ο������� StringŸ������
			// �޾ƿ��� �޼ҵ�
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� ����");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
		}catch(Exception e) {
			// �ڹ��� ��� ���ܴ� Exception�� ��ӹ޾� ��������ֱ⿡
			// �ᱹ���� �� ������ ���� �� ��
			System.out.println("�����߻���");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("������ �߻��ϵ� ���ϵ� ������ ����Ǵ� ����");
		}
		
		System.out.println("���α׷� ���� �����");
	}
}
