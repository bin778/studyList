package interTest;

public class Sergeant extends SoldierAdapter {

	@Override
	public void salute() {
		System.out.println("병장에서 재정의된 경례");
	}

}
