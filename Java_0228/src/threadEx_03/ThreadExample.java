package threadEx_03;

public class ThreadExample {

	public static void main(String[] args) {
		//�͸� Ŭ������ �����
		//�������̽��� �͸����� ���� (�͸��� ����Ŭ����)
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ī���ϱ�");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start(); 
		
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��Ʃ�� ����");
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.start(); 
		
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("�����ϱ�");
				
			}
		});
		t3.start();

	}

}
