package synchronizedThreadEx_01;

public class User2Thread extends Thread{
	
	private Calculator calculator;
	
	//������
	public User2Thread() {
		//������ �̸� ���� (�������� �޼ҵ� ȣ��)
		setName("Use2Thread");
	}
	
	//�ܺο��� ���� ��ü�� Calculator�� �޾� �ʵ忡 ����
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//����ȭ �޼ҵ� ȣ��
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
	
		
}
