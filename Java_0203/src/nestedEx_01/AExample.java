package nestedEx_01;

public class AExample {

	public static void main(String[] args) {
		
		// AŬ���� ��ü ����
		A a = new A();
		
		//AŬ���� �޼ҵ� ȣ��
		a.method();
	
		//B��� Ŭ������ �ٸ� Ŭ�������� ����غ���
		//���1) �ܺ� Ŭ������ A�� ��üȭ�ϰ� BŬ������ ��üȭ�ϱ�
		A.B b =  a.new B(); //�������� a�� ���� B��� ��ü�� �����ϴµ� ����Ÿ���� A�ȿ� �ִ� B(A.B)�̴�
		b.bMethod(); //���� Ŭ���� B�� �޼ҵ� ȣ��
		

	}

}
