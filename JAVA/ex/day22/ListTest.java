package day22;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		
		// add(���) : ��Ұ� ����Ʈ �� �������� �߰�
		names.add("�ֿ���");
		names.add("ȫ�浿");
		names.add("�迵��");
		names.add("�ֿ���");
		System.out.println(names);
		
		// add(�ε���, ���) : �ش� �ε�����ġ�� ��Ұ� �߰�
		names.add(2, "��ö��");
		System.out.println(names.size());
		
		// get(�ε���) : �ش� �ε����� �����ϴ� ��� return
		System.out.println(names.get(1));
		
		// remove(���) : ��Ҹ� ����
		names.remove("��ö��");
		System.out.println(names);
		// remove(�ε���) : �ε�����ȣ�� �ִ� ��� ����
		names.remove(0);
		System.out.println(names);
	}
}
