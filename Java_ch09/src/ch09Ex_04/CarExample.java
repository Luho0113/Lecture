package ch09Ex_04;

public class CarExample {

	public static void main(String[] args) {
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		
		//���� ��� Ŭ���� ��ü ����
		Car.Engine engine = new Car.Engine();

	}

}
