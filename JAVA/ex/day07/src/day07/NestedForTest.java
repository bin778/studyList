package day07;

public class NestedForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("����1");
			
			for (int j = 0; j < 2; j++) {
				System.out.println("i:" + i + " j:" + j);
				System.out.println("����for������");
			}
			
			System.out.println("-----");
		}
		
	}
}