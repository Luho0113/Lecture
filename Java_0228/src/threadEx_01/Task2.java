package threadEx_01;

public class Task2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("초코빵 만들기!");
		}
	}
}
