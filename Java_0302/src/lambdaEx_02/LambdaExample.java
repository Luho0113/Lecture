package lambdaEx_02;

public class LambdaExample {

	public static void main(String[] args) {
		
		// �͸��� ���� Ŭ����
		InterfaceA i1 = new InterfaceA() {
			
			@Override
			public void method() {
				System.out.println(3000);
				
			}
		};
		i1.method(); //�޼ҵ� ȣ��
		
		
		//���ٽ� ǥ��
		InterfaceA i2 = () -> {System.out.println(5000);};
		i2.method();
		

	}

}
