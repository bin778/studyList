package day22;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		
		// add(요소) : 요소가 리스트 맨 마지막에 추가
		names.add("최영빈");
		names.add("홍길동");
		names.add("김영희");
		names.add("최영빈");
		System.out.println(names);
		
		// add(인덱스, 요소) : 해당 인덱스위치에 요소가 추가
		names.add(2, "김철수");
		System.out.println(names.size());
		
		// get(인덱스) : 해당 인덱스에 존재하는 요소 return
		System.out.println(names.get(1));
		
		// remove(요소) : 요소를 삭제
		names.remove("김철수");
		System.out.println(names);
		// remove(인덱스) : 인덱스번호에 있는 요소 삭제
		names.remove(0);
		System.out.println(names);
	}
}
