package threadEx_01;

public class ThreadExample {

	public static void main(String[] args) {
		// ������ ��ü ���� ��� 1
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		
	
		// ������ ��ü ���� ��� 2
		Task2 task2 = new Task2();
		task2.start();
		
		//������ ������ ����
		for(int i = 0; i<10; i++) {
			System.out.println("ġ� �����!");
		}
		
		

	}

}
