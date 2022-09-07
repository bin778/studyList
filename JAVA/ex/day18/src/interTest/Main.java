package interTest;

public class Main {
	public static void main(String[] args) {
		// 인터페이스도 추상클래스와 마찬가지로
		//메모리상에 빈 공간이 생기기 때문에
		//객체화 불가능하다
//		Soldier s = new Soldier();
		// 업캐스팅
		Soldier a = new SecondMan();
		a.eat();
		
		Sergeant s = new Sergeant();
		s.salute();
		
		SecondMan sm = new SecondMan();
		
		sm.eat();
		sm.work();
		sm.salute();
	}
}
