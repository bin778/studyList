package day23;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
		// add(���) ����߰�
		// �ߺ��Ǵ� ���� �������� �ʰ�, ������ ����(�ε�����ȣX)
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("������");
		fruits.add("����");
		System.out.println(fruits);
		
		fruits.remove("����");
		System.out.println(fruits);
		
		for(String a : fruits) {
			System.out.println(a);
		}
		System.out.println("--------");
		
		// iterator() : returnŸ���� Iterator<���Ÿ��> Ÿ���̴�
		//				��Ʈ�� �о�� �� �ֵ��� ������ �ο��Ѵ�
		Iterator<String> iter = fruits.iterator();
		// hasNext() : ���� ��Ұ� �ִٸ� true, ���ٸ� false
		// next() : ���� ��Ҹ� return
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
	}
}
