package day04;

public class OperatorTest {
	public static void main(String[] args) {
		System.out.println("--����������--");
		System.out.println("int + ??");
		System.out.println(10 + 7);//int + int --> int
		System.out.println(10 + 3.1);//int + double --> double
		System.out.println(10 + 'a');//int + char --> int
		System.out.println(10 + "a");//int + String --> String "10a"
		
		System.out.println("double + ??");
		System.out.println(3.1 + 5);//double + int --> double
		System.out.println(3.1 + 5.9);//double + double --> double
		System.out.println(10.5 + 'a');//double + char --> double
		System.out.println(10.5 + "�ȳ��ϼ���");//double + String --> String "10.5�ȳ��ϼ���"
		
		System.out.println("char + ??");
		System.out.println('a' + 10);//char + int --> int
		System.out.println('a' + 10.5);//char + double --> double
		System.out.println('a' + 'b');//char + char --> int
		System.out.println('a' + "hello");//char + String --> String "ahello"
		
		System.out.println("String + ??");
		System.out.println("�ȳ�" + 10);//String + int --> String
		System.out.println("�ȳ�" + 10.5);//String + double --> String
		System.out.println("�ȳ�" + 'a');//String + char --> String
		System.out.println("�ȳ�" + "�ϼ���");//String + String --> String
		
		System.out.println('a' + "" + 10 + 7); //a107
		System.out.println('a' + 10 + 7 + "" + 80); //11480
		
		System.out.println("--����������--"); // String�� ��� �Ұ�
		System.out.println(10 - 5); // int - int --> int
		System.out.println(10 - 3.0); // int - double --> double
		System.out.println(5.1 - 1.1); // double - double --> double
		System.out.println('a' - 32); // char - int --> int
		System.out.println('a' - 'b'); // char - char --> int
		System.out.println('a' - 5.5); // char - double --> double
		
		System.out.println("--����������--");
		System.out.println(3.0 * 0);// double * int --> double
		System.out.println('a' * 3);// char * int --> int
		System.out.println('A' * 'B');// char * char --> int
		System.out.println(1.5 * 1.5); // double * double --> double
		System.out.println('a' * 3.5);// char * double --> double
		
		System.out.println("--������������--");
		System.out.println(9 / 2);// int / int --> int (��)
		System.out.println('a' / 5);// char / int --> int (��)
		System.out.println(10.9 / 3);// double / int --> double (��)
		System.out.println(9.9 / 3.3);// double / double --> double (��)
		System.out.println('A' / 'A');// char * char --> int (��)
		System.out.println('a' / 2.5);// char * double --> double (��)
//		System.out.println(9 / 0); 0���δ� ���� �� ����
		
		System.out.println("--������������--");
		System.out.println(10 % 3); // �������� ����Ѵ�
		System.out.println('a' % 5);// char / int --> int (������)
		
		
	}
}
