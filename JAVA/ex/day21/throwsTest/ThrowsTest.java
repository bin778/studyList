package throwsTest;

public class ThrowsTest {
	public static void main(String[] args) {
		// �޼ҵ� ����ϴ� ��� ����
		try {
			Method.findidx(-5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �߻�");
		}
		
		
		"aaa".charAt(0);
		
		try {
			Method.f(1, 3);
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
		
		try {
			Method.rest();
		} catch (InterruptedException e) {
			System.out.println("���� �߻�");
		}
		
		
	}
}
