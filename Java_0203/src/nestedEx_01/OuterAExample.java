package nestedEx_01;


public class OuterAExample {

	public static void main(String[] args) {
		
		//����Ŭ������ �޼ҵ带 ȣ���ϱ�
		//1) �ܺ�Ŭ������ ���� ��üȭ
		OuterA outerA = new OuterA();
		
		//2) �ܺ�Ŭ������ ��üȭ�� �ּҸ� ���� ���������� ����Ŭ������ ��üȭ -> innerA���� ����Ŭ������ ��ü �ּҰ� ���Ե�
		OuterA.InnerA innerA = outerA.new InnerA();
		
		//����Ŭ������ ��üȭ�� ���������� ���� ����Ŭ������ �޼ҵ带 ȣ��
		innerA.innerAMethod();
		
	

	}

}
