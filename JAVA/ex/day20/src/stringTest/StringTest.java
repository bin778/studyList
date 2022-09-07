package stringTest;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
//		String msg = "apple juice is delicious";
//		
//		// charAt(인덱스) : 문자열에서 인덱스 위치에 있는 char 값을 return
//		System.out.println(msg.charAt(6));
//		
//		// length() : 문자열의 길이를 int로 return
//		System.out.println("문자열의 길이: " + msg.length());
//		
//		// indexOf(문자)
//		// indexOf(문자열) : 해당 문자/ 문자열이 시작하는 위치 인덱스 return
//		System.out.println(msg.indexOf('d'));
//		System.out.println(msg.indexOf("pl"));
//		
//		// indexOf(문자열, 찾기시작할인덱스) : 
//		//		찾기시작할인덱스부터 문자/ 문자열이 시작하는 위치 인덱스 return
//		System.out.println(msg.indexOf('e', 5));
//		
//		String msg = "apple juice is delicious";
//		System.out.println(msg.substring(5)); // 5부터 끝까지
//		System.out.println(msg.substring(5, 10)); // 5부터 9까지
//		
//		System.out.println(Arrays.toString(msg.split(" ")));
		
		// 1. 사용자에게 문자열을 입력 받아서
		// 대문자는 소문자로, 소문자는 대문자로, 그외의 문자는 그대로 바꾸어 출력하기
		Scanner sc = new Scanner(System.in);
//		String str;
//		String change = "";
//		
//		System.out.print("문자열 입력 >> ");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
//				change += String.valueOf(str.charAt(i)).toUpperCase();
//			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
//				change += String.valueOf(str.charAt(i)).toLowerCase();
//			else
//				change += str.charAt(i);
//		}
//		
//		System.out.print("문자열 : " + change);
		
		// 2. 순위, 노래제목, 가수이름이 콤마로 구분되어 한줄로 입력된다
		// 이때 순위를 기존 순위에서 10위를 더하여 출력하라
		// 입력 >> 10,좋은날,아이유
		// 출력 >> 20,좋은날,아이유
		String str;
		String Rank1, Song, Singer;
		int Rank2;
		
		System.out.println("순위, 노래제목, 가수이름 입력 >> ");
		str = sc.nextLine();
		
		Rank1 = str.split(",")[0];
		Song = str.split(",")[1];
		Singer = str.split(",")[2];
		
		Rank2 = Integer.parseInt(Rank1) + 10;
		
		System.out.println(Rank2 + "," + Song + "," + Singer);
		
		//3. 사용자에게 한글로 숫자를 입력 받아서
		// 숫자로 출력하라
		// 입력 >> 일공이사
		// 출력 >> 1024
//		String str;
//		String change = "";
//		
//		System.out.print("한글로 숫자 입력 >> ");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			switch (str.charAt(i)) {
//			case '공':
//				change += "0";
//				break;
//			case '일':
//				change += "1";
//				break;
//			case '이':
//				change += "2";
//				break;
//			case '삼':
//				change += "3";
//				break;
//			case '사':
//				change += "4";
//				break;
//			case '오':
//				change += "5";
//				break;
//			case '육':
//				change += "6";
//				break;
//			case '칠':
//				change += "7";
//				break;
//			case '팔':
//				change += "8";
//				break;
//			case '구':
//				change += "9";
//				break;
//			default:
//				change += String.valueOf(str.charAt(i));
//			}
//		}
//		System.out.println(change);
		
	}
}
