package day23;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		
		System.out.println(scores);
		// 순서가 없다
		// value는 중복 가능
		// key는 중복 X
		
		//put(key, value) : key가중복안된다면 key값 번째 방에 value 추가
		//					key가 중복된다면 key값 번째 방에 value 수정
		scores.put("국어", 100);
		scores.put("영어", 75);
		scores.put("수학", 80);
		scores.put("과학", 100);
		scores.put("국어", 10);		
		System.out.println(scores);
		//size() : 요소의 개수 return
		System.out.println(scores.size());
		
		//get(key) : 해당 key값 번째 방에 있는 요소 return
		System.out.println(scores.get("국어"));
		
		//remove(key) : key와 value 삭제
		scores.remove("수학");
		System.out.println(scores);
		
		// keySet() : key값들이 요소로 들어있는 Set과 return
		Set<String> keys = scores.keySet();
		System.out.println(keys);
		
		for (String k : keys) {
			System.out.println(k + " : " + scores.get(k));
		}
		
		// entrySet()
		Set<Entry<String, Integer>> es = scores.entrySet();
		for(Entry<String, Integer> e : es) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
//		Map은 빠른 for문 사용 불가
//		for( a : scores) {
//			
//		}
		
		
	}
}
