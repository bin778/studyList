package day17;

public class Tiger extends Animal { // ±âº»Ã¼·Â : 70 ¸ÔÀÌ°¹¼ö : 70
	
	public Tiger() {
		super(70, 70);
	} 
	
	@Override
	public void eat() {
		feed -= 9;
		super.eat();
	}
	
	@Override
	public void rest() {
		System.out.println("È£¶ûÀÌ ÈŞ½ÄÁß~");
		for (int i = 0; i < 7; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("¿À·ù°¡¹ß»ıÇÏ¸é ½ÇÇàµÊ");
			}
			System.out.print("¾îÈï!");
		}
		System.out.println();
		hp += 20;
		feed += 20;
		show();
	}
	
}
