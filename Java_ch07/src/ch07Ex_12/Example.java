package ch07Ex_12;

public class Example {
	//action�޼ҵ带 ȣ���� �� �Ű����� C��ü�� ��쿡�� method2�� ȣ��ǵ��� �ۼ�
	
	public static void action(A a) {
		a.method1();
		
		if(a instanceof C){
			C c = (C) a; //a�� �ּҸ� �ٿ�ĳ����
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
		

	}

}
