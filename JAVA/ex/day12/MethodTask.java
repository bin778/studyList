package day12;

import java.util.Scanner;

public class MethodTask {
	// 매개변수로 char타입의 값을 넘겨받아서
	// 해당 char타입 값이 대문자라면 소문자로 바꾸고,
	// 소문자라면 대문자로 바꾸고,
	// 그외의 문자라면 그냥 그대로 냅두는 메소드
	public static char ChangeLetter(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return (char)(ch + 32);
		else if
			(ch >= 'a' && ch <= 'z')
			return (char)(ch - 32);
		else
			return ch;
	}
		
	// 매개변수로 int타입요소가 들어있는 배열을 받아와서
	// 해당 배열 모양으로 출력해주는 메소드 만들기
	public static void printAr(int[] target) {
		System.out.print("[");
		for (int i = 0; i < target.length; i++) {
			if(i == target.length - 1)
				System.out.print(target[i]);
			else
				System.out.print(target[i] + ", ");
		}
		System.out.print("]");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		int[] ar1 = {10, 30, 5};
		int[] ar2 = {1, 2 ,5, 7};
		
		System.out.print("문자 입력 >> ");
		ch = sc.next().charAt(0); // 문자 입력하는 함수
		
		System.out.println(ChangeLetter(ch));
		
		printAr(ar1);
		printAr(ar2);
	}
}
