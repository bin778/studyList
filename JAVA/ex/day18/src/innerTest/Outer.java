package innerTest;

public class Outer {
	int ov = 10;
	InnerInstance ii = new InnerInstance();
	InnerStatic is = new InnerStatic();
//	InnerLocal il = new InnerLocal();
	
	class InnerInstance {
		int iiv = 20;
		public void iif() {
			System.out.println("InnerInstanceŬ���� ���� �޼ҵ�");
		}
	}
	
	static class InnerStatic {// ���� ����ƽ Ŭ����
		int isv = 30;
		public void isf() {
			System.out.println("InnerStaticŬ���� ���� �޼ҵ�");
		}
	}
	
	public void of() {
		class InnerLocal{// ���� ����Ŭ����
			int liv = 40;
			public void ilf() {
				System.out.println("innerLocal Ŭ���� ���� �޼ҵ�");
			}
		}
		InnerLocal il = new InnerLocal();
		System.out.println(il.liv);
		il.ilf();
		
		System.out.println("Outer Ŭ���� ���� �޼ҵ�");
	}
	
}
