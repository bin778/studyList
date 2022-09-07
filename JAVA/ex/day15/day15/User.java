package day15;

public class User {
	private String pw;
	private String id;
	private int age;
	
	// �ʱ�ȭ������ ����Ű
	// alt + shift + s > o > enter
	public User(String pw, String id, int age) {
		this.pw = pw;
		this.id = id;
		this.age = age;
	}
	
	// private ���� ������ �������� �ٸ� Ŭ�������� ����Ҽ�
	// ����. ���� public���� ������ �޼ҵ带 ���� ��ȸ������
	// ����� �ؾ��ϰ�, ���������� ������ ���� �����ϴ� �޼ҵ带
	// setter��� �θ���, set������() �̸����´�
	// �ν��Ͻ����� �ӿ� �ִ� ���� return ���ִ� �޼ҵ��
	// getter��� �θ��� ���������� get������()���� �̸����´�
	
	// alt + shift + s > r > alt a > alt r
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	
	
	
}
