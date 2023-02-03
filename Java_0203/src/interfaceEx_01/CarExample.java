package interfaceEx_01;

public class CarExample {
	//교재 377
	public static void main(String[] args) {
	//자동차 객체 생성
		Car myCar = new Car();
	
		//run() 메소드 실행
		myCar.run();
	
		//타이어 객체를 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		//메소드 실행, 실행 결과가 다름(다형성)
		myCar.run();
	}
}
