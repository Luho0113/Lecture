package ch08Ex_05;

public class TV implements Remocon{
	//���� Ŭ����
	// TV Ŭ������ "TV�� �׽��ϴ�"��� ����ϱ�
	
	@Override
	public void powerOn() {
		System.out.println("TV�� �׽��ϴ�.");
	}

	public static void main(String[] args) {
		Remocon r = new TV(); //�ڽ��� ��ü�� �θ� Ÿ��(�������̽�)���� ���� ��
		r.powerOn(); 
	}

}
