package day23;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		
		System.out.println(scores);
		// ������ ����
		// value�� �ߺ� ����
		// key�� �ߺ� X
		
		//put(key, value) : key���ߺ��ȵȴٸ� key�� ��° �濡 value �߰�
		//					key�� �ߺ��ȴٸ� key�� ��° �濡 value ����
		scores.put("����", 100);
		scores.put("����", 75);
		scores.put("����", 80);
		scores.put("����", 100);
		scores.put("����", 10);		
		System.out.println(scores);
		//size() : ����� ���� return
		System.out.println(scores.size());
		
		//get(key) : �ش� key�� ��° �濡 �ִ� ��� return
		System.out.println(scores.get("����"));
		
		//remove(key) : key�� value ����
		scores.remove("����");
		System.out.println(scores);
		
		// keySet() : key������ ��ҷ� ����ִ� Set�� return
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
		
//		Map�� ���� for�� ��� �Ұ�
//		for( a : scores) {
//			
//		}
		
		
	}
}
