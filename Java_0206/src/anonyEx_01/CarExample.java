package anonyEx_01;

public class CarExample {

	public static void main(String[] args) {
		//��ü ����
		Car car = new Car();
		//�޼ҵ� ȣ�� (�͸� �ڽ� ��ü�� ���Ե� �ʵ� ���)
		car.run1();
		car.run2();
		
		car.run3(new Tire(){
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� ��ü 3�� �������ϴ�.");
			}
		});
		
		car.run4();

	}

}
