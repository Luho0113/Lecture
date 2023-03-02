package synchronizedThreadEx_02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//���� �۾� ��ü ����
		WorkObject workObject = new WorkObject();
		
		//������ ����
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		//������ ����
		threadA.start();
		threadB.start();
		
		
		//�� ������� ����
		threadA.setDaemon(false);
		//���� ������� ����
		threadB.setDaemon(true);

	}

}
