package day11;

public class MethodTest {
	public static void printName() {
		for(int i = 0; i < 5; i++) {
			System.out.println("�ֿ���");
		}
	}
	
	public static void main(String[] args) {
		MethodTest.printName();
		System.out.println("���α׷� ������....");
		MethodTest.printName();		
	}
	
}