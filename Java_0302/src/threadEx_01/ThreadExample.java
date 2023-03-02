package threadEx_01;

public class ThreadExample {

	public static void main(String[] args) {
		// ������ �̸�
		
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();
		System.out.println(threadName);
		
		PhoneThread phoneTask = new PhoneThread();
		Thread phoneThread = new Thread(phoneTask);
		phoneThread.start();
		
		YoutubeThread youtubeThread = new YoutubeThread();
		youtubeThread.start();
		
		//Phone �������� �̸� ���
		phoneThread.currentThread().setName("��ȭ�ɱ�");
		System.out.println("Phone ������ �̸� : " + phoneThread.currentThread().getName());
		
		youtubeThread.currentThread().setName("��Ʃ�� ����");
		System.out.println("Youtube ������ �̸� : " + youtubeThread.currentThread().getName());
		System.out.println();
		
		//�켱���� ���
		//1: �켱���� ���� ~ 10:�켱���� ����
		System.out.println("�켱���� : " + phoneThread.currentThread().getPriority());
		phoneThread.currentThread().setPriority(1); //�켱���� ����
		System.out.println("�ٲ� �켱���� 1) : " + phoneThread.currentThread().getPriority());
		youtubeThread.currentThread().setPriority(10);
		System.out.println("�ٲ� �켱���� 2) : " + youtubeThread.currentThread().getPriority());
		
	}

}
