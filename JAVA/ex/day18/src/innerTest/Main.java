package innerTest;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.ov);
		o.of();
		System.out.println(o.ii.iiv);
		o.ii.iif();
		System.out.println(o.is.isv);
		o.is.isf();
	}
}
