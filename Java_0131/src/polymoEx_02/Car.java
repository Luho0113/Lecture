package polymoEx_02;

public class Car {
	//Tire 클래스를 필드 선언 , 부모타입의 자료형
	public Tire tire;
	
	//Tire 클래스의 run()메소드 정의, 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll()메소드 호출
		tire.roll(); //메소드 호출
	}

}
