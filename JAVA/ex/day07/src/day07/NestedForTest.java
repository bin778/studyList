package day07;

public class NestedForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("문장1");
			
			for (int j = 0; j < 2; j++) {
				System.out.println("i:" + i + " j:" + j);
				System.out.println("안쪽for문문장");
			}
			
			System.out.println("-----");
		}
		
	}
}