package anonyEx_03;

public class Home {
	//�͸� ���� Ŭ����
	
	
	//�ʵ忡 �͸� ���� ��ü ����
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
			
		}
	};
	
	
	//�ʵ��� �޼ҵ� �̿�
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	//�޼ҵ�(���� ���� �̿�)
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("�������� �մϴ�.");
				
			}
			@Override
			public void turnOff() {
				System.out.println("�������� ���ϴ�.");
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
	}
	
	
	//�޼ҵ�(�Ű����� �̿�)
	public void use3 (RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	

	private A ar = new A() {
		@Override
		public void aM() {
			// TODO Auto-generated method stub
			
		}
	};

}
