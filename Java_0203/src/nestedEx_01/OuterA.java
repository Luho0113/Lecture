package nestedEx_01;

public class OuterA {
	//���� Ŭ������ ������ �� ���� (���� ����, �ϰ� ���� = ��ü�� ���� �������� �ʾƵ� �ܺ� Ŭ������ ������� ���� ����� �� ����)
	
	//OuterA�� �ʵ�
	int a = 100;
	
	//OuterA�� �޼ҵ�
	void aMethod() {
		
		a = a + 200;
		
		// �ܺ� Ŭ������ ���� Ŭ������ �ʵ�, �޼ҵ带 ���� Ŭ����ó�� ����� �� ����!
		// ia = ia + 200;
		// innerAMethod();
		
		//���� Ŭ���� ��üȭ
		InnerA innerA = new InnerA();
		//��üȭ�� �ּҸ� ���ؼ� ���� Ŭ������ �ʵ峪 �޼ҵ带 ����ؾ� ��
		innerA.ia = innerA.ia + 200;
		innerA.innerAMethod();
		
	}
	
	//OuterA�� ������
	public OuterA() {
		
	}
	
	//���� Ŭ����
	class InnerA {
		int ia = 200;
		void innerAMethod() { 
			a = a + 400; //�ܺ�Ŭ������ ����(�ʵ�)�� ����� �� ����
			aMethod(); //�ܺ�Ŭ������ �޼ҵ带 ȣ���� �� ����
		}
		public InnerA() { }
	}

}
