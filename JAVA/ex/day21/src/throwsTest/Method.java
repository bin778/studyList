package throwsTest;

public class Method {
	// �޼ҵ带 ����� ��� ����
	public static void findidx(int idx) throws ArrayIndexOutOfBoundsException {
		if (idx < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		System.out.println("���������� �޼ҵ� �����");
	}
	public static void f(int idx, int num) 
			throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int[] ar = {10, 20, 30};
			
		System.out.println("��� : " + ar[idx] / num);
	}
	
			
	public static void rest() throws InterruptedException {
		System.out.println("����");
		Thread.sleep(1000);
		System.out.println("��");
	}
	
	
}
