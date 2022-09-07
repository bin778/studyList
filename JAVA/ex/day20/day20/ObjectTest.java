package day20;

public class ObjectTest {
	public static void main(String[] args) {
		Car c1 = new Car(1234, "�ֿ���");
		Car c2 = new Car(5555, "�ֿ���");
		Car c3 = new Car(1234, "�ֿ���");
		Car c4 = c1;
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c4);
		System.out.println(c1 == c3);
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals("�ȳ�"));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
		
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		
		System.out.println(str1);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
