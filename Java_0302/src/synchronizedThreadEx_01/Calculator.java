package synchronizedThreadEx_01;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//synchronized�� �޼ҵ忡 �߰� -> �Ӱ� ���� = ��ü
	public synchronized void setMemory1(int memory) {
		this.memory = memory; //�޸� �� ����
		
		try {
			Thread.sleep(2000); //2�ʰ� �Ͻ�����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//�޸� �� �б�
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	//setMemory2 -> �Ӱ� ���� = �κ�
	public void setMemory2(int memory) {
		
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
	
	
}
