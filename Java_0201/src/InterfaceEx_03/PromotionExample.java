package InterfaceEx_03;

public class PromotionExample {

	public static void main(String[] args) {
		// p370
		
		//���� ��ü ����
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//�������̽� ���� ����
		A a;
		
		//�������̽� ������ ���� ��ü�� ����
		a = b;  //A <- B
		a = c;
		a = d;
		a = e;
		
		
		//������(���)���� ��ü �����غ��� 
		//�θ�Ÿ�� ���� = new �ڽ�();
		B b1 = new D();
		C c1 = new E();
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		// B b2 = new E();
		// E�� �θ�� C, A�̱� ������ ���� �߻���
		
		
		//a2�̶�� ���������� ���� CŬ������ �޼ҵ带 ȣ���ϱ�
		C c2 = (C) a2; //�ٿ� ĳ����
		c2.c1();
		
		//a4��� ���������� ���� EŬ������ �޼ҵ带 ȣ���ϱ�
		E e4 = (E) a4; 
		e4.printAll();
		
		//�������̵����� �޼ҵ� ȣ���ϱ�
		//�θ����� �޼ҵ带 �����ΰ� ������ �ϱ� C �Ǵ� A
		c1.printOver();
		

	}

}
