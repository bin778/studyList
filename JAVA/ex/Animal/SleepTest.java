package day17;

public class SleepTest {
	public static void main(String[] args) {
		// 일시적으로 실행을 멈춰주는 메소드
		// Thread 클래스 안에 만들어져있는 sleep()
		// 매개변수는 멈추고 있는 밀리초
		// 1000ms == 1s
		System.out.println("시작");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("오류가발생하면 실행됨");
			}
			System.out.println("진행중");
		}
		System.out.println("끝");
	}
}
