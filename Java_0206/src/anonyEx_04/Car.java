package anonyEx_04;

public class Car {
	//�͸� ���� Ŭ����
	
	Tire t1 = new Tire() {
		//�������̽� �θ� ������
		@Override
		public void roll() {
			System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
			
		}
	};
	
	Tire t2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("��ȣŸ�̾ �������ϴ�.");
			
		}
	};
	
}
