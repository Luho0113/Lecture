package ch09Ex_06;

public class Anonymous {
	
	//�͸� ��ü �ʵ� (field ��� ���������� ���� �͸� ��ü ����)
	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");	
		}
	};
		
	//�͸� ��ü ���� ����
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		
		localVar.run(); //���ú���.�޼ҵ�ȣ��
	}
	
	//�͸� ��ü �Ű��� ���
	void method2(Vehicle v) {
		v.run();
	}
	
}
