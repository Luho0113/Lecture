package ch16Ex_06;

public class Example {
	//apply�޼ҵ带 ���� Function �Լ��� �������̽� �ۼ��ϱ�
	
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y); //��������.�޼ҵ�()
	}

	public static void main(String[] args) {

		double result = calc((x, y) -> (x / y)); //Function fun = (x, y) -> (x/y)
		System.out.println("result: " + result);
	}
}
