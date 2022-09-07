package anonyTest;

public interface Soldier {
	// 인터페이스 안에는 추상메소드만 존재할 수 있기 때문에
	// abstract는 생략 가능
	public void eat();
	public abstract void work();
	public abstract void salute();
}
