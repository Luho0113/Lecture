package threadEx_02;

public class Task1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("고기만두 만들기!");
		}

	}
}
