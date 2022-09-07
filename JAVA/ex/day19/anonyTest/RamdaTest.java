package anonyTest;

public class RamdaTest {
	public static void launch(Onclick onclick) {
		System.out.println(onclick.f(10, 15));
	}
	
	public static void main(String[] args) {
		RamdaTest.launch((int a, int b) -> a * b);
		RamdaTest.launch((int a, int b) -> a + b);
		
		RamdaTest.launch(new Onclick() {
			
			@Override
			public int f(int a, int b) {
				return 0;
			}
		});
		
		
		Onclick onclick = null;
		
		onclick = new Onclick() {		
			@Override
			public int f(int a, int b) {
				return a + b;
			}
		};
		
		onclick = (int a, int b) -> {return a + b;};
		onclick = (int a, int b) -> a + b;
		
		
		
	}
}
