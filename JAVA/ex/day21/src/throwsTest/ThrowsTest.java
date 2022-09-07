package throwsTest;

public class ThrowsTest {
	public static void main(String[] args) {
		// 메소드 사용하는 사람 입장
		try {
			Method.findidx(-5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 발생");
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
			System.out.println("오류 발생");
		}
		
		
	}
}
