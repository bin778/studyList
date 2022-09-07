package day04;

public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println('a' <= 'b');
		System.out.println(100 != 100);
		
		// 문자열이 서로 같은지
		// 메소드를 사용한다
		// equals()
		// 문자열1.equals(문자열2) : 문자열1과 문자열2가 서로 같니? 맞으면 true, 아니면 false
		
		System.out.println("안녕".equals("반가워"));
		System.out.println("안녕".equals("안녕"));
	}
}
