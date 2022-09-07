package day23;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
		// add(요소) 요소추가
		// 중복되는 값은 저장하지 않고, 순서가 없다(인덱스번호X)
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("복숭아");
		fruits.add("복숭아");
		fruits.add("복숭아");
		fruits.add("포도");
		System.out.println(fruits);
		
		fruits.remove("포도");
		System.out.println(fruits);
		
		for(String a : fruits) {
			System.out.println(a);
		}
		System.out.println("--------");
		
		// iterator() : return타입이 Iterator<요소타입> 타입이다
		//				세트를 읽어올 수 있도록 순서를 부여한다
		Iterator<String> iter = fruits.iterator();
		// hasNext() : 다음 요소가 있다면 true, 없다면 false
		// next() : 다음 요소를 return
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
	}
}
