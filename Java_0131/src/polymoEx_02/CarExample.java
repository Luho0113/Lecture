package polymoEx_02;

public class CarExample {
	//교재 p.315
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체를 장착 / 부모타입객체생성
		myCar.tire = new Tire();
		myCar.run();
		
		
		//부모 자료 변수에 자식 객체를 넣어준 것
		//HankookTire 객체를 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
