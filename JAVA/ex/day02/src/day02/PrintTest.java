package day02;

public class PrintTest {
	public static void main(String[] args) {
		// \" : ���ڿ� �ȿ��� "�� ǥ��
		System.out.println("���� ���ߴ� \"�������\"���");
		
		// \\ : ���ڿ� �ȿ��� \�� ǥ��
		System.out.println("�������� ����� \\�Դϴ�");
		
		// \n : ���ڿ� �ȿ��� ���͸� ǥ���Ѵ�
		System.out.println("������\nȭ����");
		
		// \t : ���ڿ� �ȿ��� Tab�� ǥ���Ѵ�
		System.out.println("��\t100��\n����\t1000��");
		
		// print() �޼ҵ�
		System.out.print("�ȳ��ϼ���");
		System.out.print("�ݰ����ϴ�\n");
		
		// printf() �޼ҵ�
		System.out.printf("%d�� %-2d��\n", 2022, 7);
		System.out.printf("�������� %-10.2f�Դϴ�\n", 3.14);
		System.out.printf("���� ������ %-9c�Դϴ�\n", 'A');
		System.out.printf("���� �̸����� %-7s�Դϴ�\n", "�ֿ���");
		
		
	}
}
