package interTest;

public class SecondMan implements Soldier {

	@Override
	public void eat() {
		System.out.println("이등병이 먹습니다");
	}

	@Override
	public void work() {
		System.out.println("이등병이 일을 하지만 잘 못한다");
	}

	@Override
	public void salute() {
		System.out.println("충!!성!!!!");
	}

}
