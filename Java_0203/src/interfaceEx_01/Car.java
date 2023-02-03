package interfaceEx_01;

public class Car {
	//필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//메소드
	void run() {
		tire1.roll(); //추상메소드를 호출 (구현객체의 roll()메소드를 실행)
		tire2.roll();
	}
}
