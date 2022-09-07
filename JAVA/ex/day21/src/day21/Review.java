package day21;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
//		String input, res = "";
		Scanner sc = new Scanner(System.in);
//		// 1. 사용자에게 문자열을 입력 받아서
//		System.out.print("문자열 입력 >> ");
//		input = sc.nextLine();
//		// 대문자는 소문자로, 소문자는 대문자로, 그외의 문자는 그대로 바꾸어 출력하기
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			if(ch >= 'A' && ch <= 'Z') {
//				res += (char)(ch + 32);
//			}else if(ch >= 'a' && ch <= 'z') {
//				res += (char)(ch - 32);
//			}else {
//				res += ch;
//			}
//		}
//		System.out.println(res);
		
		// 2. 순위, 노래제목, 가수이름이 콤마로 구분되어 한줄로 입력된다
		// 이때 순위를 기존 순위에서 10위를 더하여 출력하라
		// 입력 >> 10,좋은날,아이유
		// 출력 >> 20,좋은날,아이유
//		String input = sc.nextLine();
//		String[] temp = input.split(",");
//		// temp : {"10", "좋은날", "아이유"}
//		temp[0] = Integer.parseInt(temp[0]) + 10 + "";
//		
//		// temp : {"20", "좋은날", "아이유"}
//		// String클래스 안에 존재하는 join메소드
//		// String.join(연결할문자열, 배열)
//		System.out.println(String.join(",", temp));
//		System.out.println("----------------");		
//		String res = "";
//		for(int i = 0; i < temp.length; i++) {
//			if(i != temp.length - 1) {
//				res += temp[i] + ",";
//			}else {
//				res += temp[i];
//			}
//		}
//		System.out.println(res);
		
		//3. 사용자에게 한글로 숫자를 입력 받아서
		// 숫자로 출력하라
		// 입력 >> 일공이사
		// 출력 >> 1024
		System.out.print("입력 >> ");
		String input = sc.nextLine();
		
		String hangeul = "공일이삼사오육칠팔구";
		
		String res = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			res += hangeul.indexOf(ch);
		}
		System.out.print("결과 : " + res);
		
	}
}
