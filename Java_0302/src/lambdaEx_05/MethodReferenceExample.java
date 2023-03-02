package lambdaEx_05;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// ��ü ����
		Person person = new Person();
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		
		//���� �޼ҵ��� ���
		//���ٽ�
		person.action((double x, double y)->{return Computer.staticMethod(x, y);});
		person.action((x, y)->Computer.staticMethod(x, y));
		//�޼ҵ� ����
		person.action(Computer::staticMethod);
		
		
		//�ν��Ͻ� �޼ҵ��� ���
		Computer computer = new Computer();
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return computer.staticMethod(x, y);
			}
		});
		//���ٽ�
		person.action((x,y) -> computer.instanceMethod(x, y));
		//�޼ҵ� ���� (���������� �޼ҵ带 ȣ��)
		person.action(computer::instanceMethod);

	}

}
