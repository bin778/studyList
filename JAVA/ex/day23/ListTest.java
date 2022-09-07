package day23;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
	public static void main(String[] args) {
		// int Ÿ���� ��ҷ� �����ϴ� li��� List �����
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10); // �Ű��������� IntegerŸ���� �ʿ��ѵ�
					// 10�̶�� int���� �ѱ�� �����Ƿ� auto boxing�� �ǰ� �ִ�
		System.out.println(li);	
		for (int a: li) { // li �ӿ��� IntegerŸ�� ��ü�� ���Դµ�
			// Integer Ÿ�� ��ü�� int Ÿ�� ���� a�� ���� �ֱ� ������ auto unboxing
			// �ǰ� �ִ�
			System.out.println(a);
		}
		
		
		// names ��� ����Ʈ�� ��ҷ� ?? Ÿ���� �����Ѵ�
		ArrayList<String> names = new ArrayList<>();
		names.add("�ֿ���");
		names.add("��ö��");
		names.add("�ڿ���");
		System.out.println(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------------");
		
		for (String a: names) {
			System.out.println(a);
		}
		
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("���");
		fruits.add("�ٳ���");
		System.out.println(fruits);
	}
}
