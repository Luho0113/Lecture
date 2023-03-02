package synchronizedThreadEx_02;

public class WorkObject {
//�� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
	
	//����ȭ �޼ҵ� A
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify(); //�ٸ� �����带 ���� ��� ���·� �ٲ�
		
		try {
			wait(); //�ڽ��� ������� �Ͻ� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//����ȭ �޼ҵ� B
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify(); // ���� ��� ����

		try {
			wait(); // �Ͻ� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
