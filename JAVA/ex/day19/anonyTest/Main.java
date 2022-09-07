package anonyTest;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car() {
			String mode;
			
			@Override
			public void engineOn() {
				System.out.println("버튼으로 시동켰습니다");
			}
			
			public void openRoof() {
				System.out.println("지붕을 열었습니다");
			}
		};
		myCar.price = 100;
		myCar.go();
		myCar.engineOn();
//		myCar.openRoof(); // 업캐스팅되면 자식에서 새롭게 메소드 사용 불가
		
		Soldier s = new Soldier() {
			@Override
			public void work() {
				System.out.println("이등병이 일한다");
			}
			
			@Override
			public void salute() {
				System.out.println("이등병이 경례한다");
			}
			
			@Override
			public void eat() {
				System.out.println("이등병이 짬밥을 먹는다");
			}
		};
		s.salute();
		s.work();
		s.eat();
		
	}
}
