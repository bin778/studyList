package day17;

public class Animal {
	int hp; // 현재체력을 저장할 공간
	int feed; // 현재 먹이갯수를 저장할 변수
	
	// alt shift s > o > enter
	public Animal(int hp, int feed) {
		super();// Object() : Object(부모)클래스의 생성자
		this.hp = hp;
		this.feed = feed;
	}
	
	public void show() {
		System.out.println("현재 체력 : " + hp);
		System.out.println("현재 음식개수 : " + feed);
	}
	
	public void eat() {
		hp++;
		feed--;
		show();
	}
	
	public void walk() {
		hp--;
		feed++;
		show();
	}
	
	public void rest() {
		hp += 20;
		feed += 20;
		
		System.out.println("휴식 시작!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("오류발생시 실행됨");
		}
		System.out.println("휴식끝!");
		show();
	}
	
}
