package synchronizedThreadEx_02;

public class ThreadB extends Thread{
	
	private WorkObject workObject;
	
	//�����۾� ��ü�� �����ڷ� ����
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodB(); //����ȭ�޼ҵ� methodA�� 10�� ȣ��
		}
	}
}
