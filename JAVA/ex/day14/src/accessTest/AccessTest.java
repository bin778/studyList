package accessTest;

public class AccessTest {
	public int a;
	protected int b;
	int c;// default
	private int d;
	
	public void check() {
		a = 10;
		b = 10;
		c = 10;
		d = 10;
		f1();
		f2();
		f3();
		f4();
	}
	
	public void f1() {
		
	}
	
	protected void f2() {
		
	}
	
	void f3() {
		
	}
	
	private void f4() {
		
	}
}
