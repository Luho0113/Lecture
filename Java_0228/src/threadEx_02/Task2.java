package threadEx_02;

public class Task2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("김치만두 만들기!");
		}
	}
}
