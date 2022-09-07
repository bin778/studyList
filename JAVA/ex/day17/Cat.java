package day17;

public class Cat extends Animal { // ±âº»Ã¼·Â : 50 ¸ÔÀÌ°¹¼ö : 50

	public Cat() {
		super(50, 50);
	} 
	
	@Override
	public void walk() {
		hp -= 10;
		feed += 10;
		show();
	}
	
	@Override
	public void rest() {
		System.out.println("°í¾çÀÌ ÈŞ½ÄÁß~");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("¿À·ù°¡¹ß»ıÇÏ¸é ½ÇÇàµÊ");
			}
			System.out.print("¾ß¿Ë!");
		}
		System.out.println();
		hp += 20;
		feed += 20;
		show();
	}
	
	public void onlyCat() {
		System.out.println("¾ß¿Ë¾ß¿Ë");
	}
	
}
