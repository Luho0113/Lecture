package polymoEx_02;

public class CarExample {
	//���� p.315
	public static void main(String[] args) {
		//Car ��ü ����
		Car myCar = new Car();
		
		//Tire ��ü�� ���� / �θ�Ÿ�԰�ü����
		myCar.tire = new Tire();
		myCar.run();
		
		
		//�θ� �ڷ� ������ �ڽ� ��ü�� �־��� ��
		//HankookTire ��ü�� ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
