package anonyEx_01;

public class Car {
	//����Ͻ� Ŭ����
	
	//�ʵ�(tire1)�� Tire ��ü ����
	private Tire tire1 = new Tire();
	
	//�͸� �ڽ� ��ü ����
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� ��ü1�� �������ϴ�.");
		}
	};
	
	//�޼ҵ� ȣ��
	public void run1() {
		tire1.roll(); //���: �Ϲ� Ÿ�̾�
		tire2.roll(); //���: �͸� �ڽ�
	}
	
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� ��ü 2�� �������ϴ�.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
	//����
	private Tire tire4 = new Tire() {
		@Override
		public void roll() {
			System.out.println("��ȣ Ÿ�̾ �������ϴ�.");
		}
	};
	
	public void run4() {
		tire4.roll();
	}
	
	

}
