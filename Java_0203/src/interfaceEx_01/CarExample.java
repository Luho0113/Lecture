package interfaceEx_01;

public class CarExample {
	//���� 377
	public static void main(String[] args) {
	//�ڵ��� ��ü ����
		Car myCar = new Car();
	
		//run() �޼ҵ� ����
		myCar.run();
	
		//Ÿ�̾� ��ü�� ��ü
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		//�޼ҵ� ����, ���� ����� �ٸ�(������)
		myCar.run();
	}
}
