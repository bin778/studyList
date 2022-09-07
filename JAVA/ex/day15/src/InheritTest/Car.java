package InheritTest;

public class Car {
	String name;
	String color;
	String manu;
	String carName;
	int price;
	
	public void go() {
		System.out.println("자동차가 앞으로 갑니다.");
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	public void engineOn() {
		System.out.println("버튼으로 시동을 켰습니다.");
	}
	
	public void engineOff() {
		System.out.println("버튼으로 시동을 껐습니다.");
	}
	
	public void show() {
		System.out.println("---차량정보---");
		System.out.println("차주 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("제조사 : " + manu);
		System.out.println("모델명 : " + carName);
		if (price >= 10000) {
			System.out.print("가격 : " + price / 10000 + "억");
			if (price % 10000 != 0)
				System.out.print(price % 10000 + "만");
			System.out.println("원");
		}
		else
			System.out.println("가격 : " + price + "만원");
	}
}
