package day09;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		//������ int ���� �޾ƿ��� �޼ҵ�
		// �޼ҵ� �̸� : nextInt(), Random Ŭ���� �ȿ� ������� �ִ�
		Random r = new Random();
		//Scanner sc = new Scanner();
		
		//nextInt(int��): 0���� int��-1 ������ ������ ������ int ���� ����� �����´�
		//nextInt()�� ����� ����� intŸ���� ���̴�
		System.out.println(r.nextInt(10));
	}
}
