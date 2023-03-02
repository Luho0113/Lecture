package lambdaEx_01;

public class LambdaExample {

	public static void main(String[] args) {
		//���ٽ�
		
		//��� 1) ����Ŭ������ ��ü�� �����ϰ� �����ǵ� �޼ҵ带 ȣ���ϴ� ��
		CalculableImpl c1 = new CalculableImpl();
		c1.c();
		
		//��� 2) �������̽��� �͸��� ����Ŭ������ ����� �߻� �޼ҵ带 �������ؼ� ����ϴ� ��
		Calculable c2 = new Calculable() {
			
			@Override
			public void c() {
				System.out.println("�͸��� ���� Ŭ�����Դϴ�!");
				
			}
		};
		c2.c();
		
		//��� 3) ���ٽ� ǥ��
		//�ش��ϴ� �������̽��� �޼ҵ尡 1�� �ۿ� ���� ��� = �Լ��� �������̽� -> �޼ҵ���� ������ �� ����
		Calculable c3 = () -> {System.out.println("���ٽ� ǥ���Դϴ�!"); };
		c3.c();

	}

}
