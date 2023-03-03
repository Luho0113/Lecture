package ch16Ex_04;

public class Example {

	public static void main(String[] args) {
		// 4번
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<3; i++) {
					System.out.println("작업 스레드가 실행됩니다.");
				}
				
			}
		});
		thread.start();
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("작업 스레드가 실행됩니다.");
			}
		});
		thread2.start();

	}

}
