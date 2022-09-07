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
		// private으로 설정된 변수, 메소드는
		// 같은 클래스 내에서만 사용이 가능하다
		
	}
}
