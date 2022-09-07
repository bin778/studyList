package genericTest;

import anonyTest.Car;

public class Main {
	public static void main(String[] args) {
		Test<String, Car> t = new Test<String, Car>();
		Test<Car, String> t2 = new Test<Car, String>();
	}
}
