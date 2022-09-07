package day15;

public class User {
	private String pw;
	private String id;
	private int age;
	
	// 초기화생성자 단축키
	// alt + shift + s > o > enter
	public User(String pw, String id, int age) {
		this.pw = pw;
		this.id = id;
		this.age = age;
	}
	
	// private 으로 설정된 변수들은 다른 클래스에서 사용할수
	// 없다. 따라서 public으로 설정된 메소드를 통해 우회적으로
	// 사용을 해야하고, 관례적으로 변수에 값을 저장하는 메소드를
	// setter라고 부르고, set변수명() 이름짓는다
	// 인스턴스변수 속에 있는 값을 return 해주는 메소드는
	// getter라고 부르며 관례적으로 get변수명()으로 이름짓는다
	
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
