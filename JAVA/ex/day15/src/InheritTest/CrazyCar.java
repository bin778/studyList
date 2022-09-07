package InheritTest;

public class CrazyCar extends Car {
	public void SUA() {
		System.out.println("자동차가 급발진을 합니다.");
	}
	
	@Override
	public void engineOn() {
		System.out.println("버튼으로 시동을 켰습니다.");
	}
	
	@Override
	public void engineOff() {
		System.out.println("버튼으로 시동을 껐습니다.");
	}
}
