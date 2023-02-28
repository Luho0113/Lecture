package threadEx_01;

public class ThreadExample {

	public static void main(String[] args) {
		// 스레드 객체 생성 방법 1
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		
	
		// 스레드 객체 생성 방법 2
		Task2 task2 = new Task2();
		task2.start();
		
		//메인이 수행할 내용
		for(int i = 0; i<10; i++) {
			System.out.println("치즈빵 만들기!");
		}
		
		

	}

}
