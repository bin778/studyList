package accessTest;

public class Main {
	public static void main(String[] args) {
		User u = new User();
//		u.age = -500;
		u.setAge(-500);
//		u.id = "abc123";
		u.setId("abc123");
		
		System.out.println(u.getId());
		
		AccessTest at = new AccessTest();
		at.a = 10;
		// private���� ������ ����, �޼ҵ��
		// ���� Ŭ���� �������� ����� �����ϴ�
		
	}
}
