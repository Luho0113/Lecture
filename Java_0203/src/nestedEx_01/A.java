package nestedEx_01;

public class A {
	//AŬ������ BŬ������ �����ؼ� ����ϴ� ��
	
	class B{ 
		public B() {
			System.out.println("BŬ������ �⺻������");
		}
		
		void bMethod() {
			System.out.println("BŬ������ ���� �޼ҵ�");
		}
	};
	
	// B field = new B();
	
	//A�� �⺻ ������ �ȿ� ��ü ����
	A() {
		System.out.println("AŬ������ �⺻������");
		B b = new B();
	}
	
	//�޼ҵ� �ȿ� ����
	void method() {
		System.out.println("��� �޼ҵ� ȣ�� ���");
		B b = new B();
	}
}
