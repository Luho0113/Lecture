package polymoEx_03;

public class DriverExample {
	//���� p.318
	public static void main(String[] args) {
		//Driver ��ü ����
		Driver myDriver = new Driver();
		
		//�Ű������� Bus��ü�� �����ϰ� driver()�޼ҵ� ȣ��
		Bus bus = new Bus();
		myDriver.drive(bus);  //bus�� �ּҰ� 
		// myDriver.drive(new Bus()); �� ����
		// ��� : ������ �޸��ϴ�
		
		//�Ű������� Taxi��ü�� �����ϰ� driver()�޼ҵ� ȣ��
		Taxi taxi = new Taxi();
		myDriver.drive(taxi);
		// myDriver.drive(new Taxi());
		// ��� : �ýð� �޸��ϴ�.
		
		
		
	
	}

}
