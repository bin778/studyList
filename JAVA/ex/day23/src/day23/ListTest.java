package day23;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
	public static void main(String[] args) {
		// int 타입을 요소로 저장하는 li라는 List 만들기
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10); // 매개변수에는 Integer타입이 필요한데
					// 10이라는 int값을 넘기고 있으므로 auto boxing이 되고 있다
		System.out.println(li);	
		for (int a: li) { // li 속에서 Integer타입 객체가 들어왔는데
			// Integer 타입 객체가 int 타입 변수 a에 들어가고 있기 때문에 auto unboxing
			// 되고 있다
			System.out.println(a);
		}
		
		
		// names 라는 리스트는 요소로 ?? 타입을 저장한다
		ArrayList<String> names = new ArrayList<>();
		names.add("최영빈");
		names.add("김철수");
		names.add("박영희");
		System.out.println(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------------");
		
		for (String a: names) {
			System.out.println(a);
		}
		
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("사과");
		fruits.add("바나나");
		System.out.println(fruits);
	}
}
