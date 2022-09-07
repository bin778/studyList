package day13;

public class Review {
	
	public static int change(int a) {
		String name = "¾È³ç";
		a = a + 100;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 10;
		Review.change(a);
		System.out.println(a);
	}
}
