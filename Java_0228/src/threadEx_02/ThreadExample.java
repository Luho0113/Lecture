package threadEx_02;

public class ThreadExample {

	public static void main(String[] args) {
		// ��ü ����
		Runnable task1 = new Task1();
		Thread gogi = new Thread(task1);
		Thread kimchi = new Task2();
		
		//������ ����
		gogi.start();
		kimchi.start(); //��ġ���� �԰�ʹ�

	}

}
