package threadEx_02;

public class SleepExample {

	public static void main(String[] args) {
		//sleep
		
		Thread t2 = new Thread (new Runnable() {
			
			@Override
			public void run() {
				for (int i=2; i<=20; i++) {
					for(int j=1; j<=9; j++) {
						System.out.println(i + "X" + j + "=" + i*j + "\t");
					}
					System.out.println();
				}
				
			}
		});
		
		Thread t1 =  new Thread( new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<50; i++) {
					System.out.println("--");
				}
				
				try {
					t2.start();
					t2.join(); //�Ͻ���������
					
					//�־��� �ð����� ��������, �ð��� ������ �ٽ� ���� ������
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		

		
		t1.start();
		t2.start();

	}

}
