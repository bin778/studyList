package throwsTest;

public class Method {
	// 메소드를 만드는 사람 입장
	public static void findidx(int idx) throws ArrayIndexOutOfBoundsException {
		if (idx < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		System.out.println("정상적으로 메소드 실행됨");
	}
	public static void f(int idx, int num) 
			throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int[] ar = {10, 20, 30};
			
		System.out.println("결과 : " + ar[idx] / num);
	}
	
			
	public static void rest() throws InterruptedException {
		System.out.println("시작");
		Thread.sleep(1000);
		System.out.println("끝");
	}
	
	
}
