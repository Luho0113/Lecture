package ch16Ex_04;

public class Example {

	public static void main(String[] args) {
		// 4��
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					System.out.println("�۾� �����尡 ����˴ϴ�.");
				}
				
			}
		});
		thread.start();
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("�۾� �����尡 ����˴ϴ�.");
			}
		});
		thread2.start();

	}

}
