package synchronizedThreadEx_01;

public class User1Thread extends Thread {
	
	private Calculator calculator;
	
	//������
	public User1Thread() {
		//������ �̸� ���� (�������� �޼ҵ� ȣ��)
		setName("Use1Thread");
	}
	
	//�ܺο��� ���� ��ü�� Calculator�� �޾� �ʵ忡 ����
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//����ȭ �޼ҵ� ȣ��
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
	
	
}
