package ch09Ex_04;

public class CarExample {

	public static void main(String[] args) {
		//인스턴스 멤버 클래스 객체 생성
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		//정적 멤버 클래스 객체 생성
		Car.Engine engine = new Car.Engine();

	}

}
