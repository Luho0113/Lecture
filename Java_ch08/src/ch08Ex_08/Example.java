package ch08Ex_08;

public class Example {
	

	public static void action (A a) { //�Ű����� a�� Ÿ���� �ν��Ͻ�
		
		//method1() ����
		a.method1();
		
		if (a instanceof C) { //���������� CŬ���� Ÿ������ �Ǻ�
			//�Ű����� C��ü�� ��쿡�� method2�� ȣ��
			C c = (C) a; //a �ּҸ� C��� Ŭ����(��ü)�� Ÿ��ĳ����
			c.method2();
		}
	}

	public static void main(String[] args) {
		
		action(new B());
		action(new C());

	}
	

}
