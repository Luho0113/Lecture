package synchronizedThreadEx_02;

public class ThreadA extends Thread{
//WorkObject�� methodA�� �����ϴ� ������
	
	private WorkObject workObject;
	
	//�����۾� ��ü�� �����ڷ� ����
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodA(); //����ȭ�޼ҵ� methodA�� 10�� ȣ��
		}
	}
}
