package exceptionEx_05;

public class A {
	
	public void a1() throws ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException {
		a2();
		
		Class.forName("java.lang.String");
	}
	
	public void a2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		//, �� ���� ó�� Ŭ������ ����
		a3();
		int[] number = {1,2,3};
		System.out.println(number[2]);
	}
	public void a3() throws ArithmeticException { //���� ���ѱ��
		//ȣ���ϴ� �����ٰ� ���ܸ� ���ѱ�
		//int a = 10/0; -> ���ܹ߻�
		int a = 10/5;
		
		
	}
}
