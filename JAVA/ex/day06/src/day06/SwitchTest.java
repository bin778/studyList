package day06;

public class SwitchTest {
	public static void main(String[] args) {
		int num = 10;
		
		switch(num) {
		case 5:
			System.out.println("영역1");
			break; //switch문에서 빠져나온다.
		case 3:
			System.out.println("영역2");
			break; //switch문에서 빠져나온다.
		case 10:
			System.out.println("영역3");
			break; //switch문에서 빠져나온다.
		default:
			System.out.println("영역4");	
		}
	}
}
