package nestedEx_02;

public class A {
	
	int a = 10;
	static int sa = 20;
	
	void m1() {
		a = a + 1;
		sa = sa + 1;
	}
	
	static void sm1() {
		// static�� ���� �޸𸮿� �ö󰡱� ������ �ν��Ͻ� ����� ��� �Ұ�����
		// a = a + 2; 
		
		sa = sa + 2;
		
	}
	
	// �����ڴ� �ν��Ͻ� ���, ���� ��� �� ����� �� ����
	// ������� ���� �ʱ�ȭ�ϴ� �����̱� ����!
	public A() {
		a = a + 3;
		sa = sa + 3;
		m1();
		sm1();
	}
	
	
	//���� Ŭ����
	class IA {
	// class IA�� new �����ڸ� �ؾ� ����� ������ 
	//-> Ŭ������ static�� �ٿ��� static�� ���� ������� ����� �� ����
		int ia = 20;
		// static int isa = 20;
		
		void iaM() {
		//�ٱ��� �ִ� �ܺ� Ŭ������ ������� �� ����� �� ����
			a = a + 10;
			sa = sa + 10;
			m1();
			sm1();
		}
		
		// static void isaM() {
			
		// }
		
	}
	
	static class IB {
		a = a + 20; //���� �߻�
		//class B�� ���� static���� �޸𸮿� �ö󰬱� ������ �ν��Ͻ� ����� ����� �� ����
		
	}

}
