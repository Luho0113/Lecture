package polymoEx_05;

public class PolyTvMain {

	public static void main(String[] args) {
		// ����
		
		//�ڽ� ������ ��ü ���� - �θ�� �ڽ��� �ʵ带 �� ����� �� ����
		CaptionTv ca = new CaptionTv();
		ca.channel = 11;
		ca.power = true;
		ca.text = "�ĳ��";
		
		//Tv ��ü ���� - �ڽ� Ŭ������ �ʵ� ��� �Ұ���
		Tv Tv = new Tv();
		Tv.channel = 7;
		Tv.power = false;
		Tv.channelDown();
		Tv.channelUp();
		
		//�������� ����� ��üȭ�ϱ�
		Tv myTv = new CaptionTv(); //�θ�Ŭ���� ���� = new �ڽ�Ŭ����();
		myTv.channel = 8;
		myTv.power = false;
		System.out.println("=================");
		myTv.channelUp(); //�θ� override�� �޼ҵ� = �ڽ� �޼ҵ带 ȣ��
		
		//1. �θ� Ŭ������ ���� �޼ҵ带 �÷��� �ڽ� �޼ҵ忡�� �������̵�
		// myTv.text = "�ڽ� �ʵ�"; �θ� Ŭ������ .text()�� ���ٸ� ��� �Ұ���!
		// myTv.caption(); �ڽ� �ʵ��� �޼ҵ� ��� �Ұ���!
		
		
		//2. �ٿ�ĳ�������� �ҷ�����
		CaptionTv ct1 = (CaptionTv) myTv; //�ٿ�ĳ����
		ct1.text = "�ڽ� �ʵ� ��� ����!";//�ڽ� �ʵ�� �޼ҵ带 ���
		ct1.caption(); 
		

	}

}
