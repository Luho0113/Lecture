package polymoEx_05;

public class Tv {
	//�θ� Ŭ����
	boolean power; //�����ʵ�
	int channel; //ä��
	
	//�������� �޼ҵ�
	void power() {
		power = !power;
	}
	
	//ä���� Ű�� �޼ҵ�
	void channelUp() {
		++channel;
	}
	
	//ä���� ���� �޼ҵ�
	void channelDown() {
		--channel;
	}

}
