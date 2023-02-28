package threadEx_02;

public class ThreadExample {

	public static void main(String[] args) {
		// 객체 생성
		Runnable task1 = new Task1();
		Thread gogi = new Thread(task1);
		Thread kimchi = new Task2();
		
		//스레드 실행
		gogi.start();
		kimchi.start(); //김치만두 먹고싶다

	}

}
