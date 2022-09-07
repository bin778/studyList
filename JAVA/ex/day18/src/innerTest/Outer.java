package innerTest;

public class Outer {
	int ov = 10;
	InnerInstance ii = new InnerInstance();
	InnerStatic is = new InnerStatic();
//	InnerLocal il = new InnerLocal();
	
	class InnerInstance {
		int iiv = 20;
		public void iif() {
			System.out.println("InnerInstance클래스 안의 메소드");
		}
	}
	
	static class InnerStatic {// 내부 스태틱 클래스
		int isv = 30;
		public void isf() {
			System.out.println("InnerStatic클래스 안의 메소드");
		}
	}
	
	public void of() {
		class InnerLocal{// 내부 지역클래스
			int liv = 40;
			public void ilf() {
				System.out.println("innerLocal 클래스 안의 메소드");
			}
		}
		InnerLocal il = new InnerLocal();
		System.out.println(il.liv);
		il.ilf();
		
		System.out.println("Outer 클래스 안의 메소드");
	}
	
}
