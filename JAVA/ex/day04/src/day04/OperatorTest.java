package day04;

public class OperatorTest {
	public static void main(String[] args) {
		System.out.println("--덧셈연산자--");
		System.out.println("int + ??");
		System.out.println(10 + 7);//int + int --> int
		System.out.println(10 + 3.1);//int + double --> double
		System.out.println(10 + 'a');//int + char --> int
		System.out.println(10 + "a");//int + String --> String "10a"
		
		System.out.println("double + ??");
		System.out.println(3.1 + 5);//double + int --> double
		System.out.println(3.1 + 5.9);//double + double --> double
		System.out.println(10.5 + 'a');//double + char --> double
		System.out.println(10.5 + "안녕하세요");//double + String --> String "10.5안녕하세요"
		
		System.out.println("char + ??");
		System.out.println('a' + 10);//char + int --> int
		System.out.println('a' + 10.5);//char + double --> double
		System.out.println('a' + 'b');//char + char --> int
		System.out.println('a' + "hello");//char + String --> String "ahello"
		
		System.out.println("String + ??");
		System.out.println("안녕" + 10);//String + int --> String
		System.out.println("안녕" + 10.5);//String + double --> String
		System.out.println("안녕" + 'a');//String + char --> String
		System.out.println("안녕" + "하세요");//String + String --> String
		
		System.out.println('a' + "" + 10 + 7); //a107
		System.out.println('a' + 10 + 7 + "" + 80); //11480
		
		System.out.println("--뺄셈연산자--"); // String은 사용 불가
		System.out.println(10 - 5); // int - int --> int
		System.out.println(10 - 3.0); // int - double --> double
		System.out.println(5.1 - 1.1); // double - double --> double
		System.out.println('a' - 32); // char - int --> int
		System.out.println('a' - 'b'); // char - char --> int
		System.out.println('a' - 5.5); // char - double --> double
		
		System.out.println("--곱셈연산자--");
		System.out.println(3.0 * 0);// double * int --> double
		System.out.println('a' * 3);// char * int --> int
		System.out.println('A' * 'B');// char * char --> int
		System.out.println(1.5 * 1.5); // double * double --> double
		System.out.println('a' * 3.5);// char * double --> double
		
		System.out.println("--나눗셈연산자--");
		System.out.println(9 / 2);// int / int --> int (몫)
		System.out.println('a' / 5);// char / int --> int (몫)
		System.out.println(10.9 / 3);// double / int --> double (몫)
		System.out.println(9.9 / 3.3);// double / double --> double (몫)
		System.out.println('A' / 'A');// char * char --> int (몫)
		System.out.println('a' / 2.5);// char * double --> double (몫)
//		System.out.println(9 / 0); 0으로는 나눌 수 없다
		
		System.out.println("--나머지연산자--");
		System.out.println(10 % 3); // 나머지를 계산한다
		System.out.println('a' % 5);// char / int --> int (나머지)
		
		
	}
}
