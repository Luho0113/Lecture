package interfaceEx_01;

public class Car {
	//�ʵ�
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//�޼ҵ�
	void run() {
		tire1.roll(); //�߻�޼ҵ带 ȣ�� (������ü�� roll()�޼ҵ带 ����)
		tire2.roll();
	}
}
