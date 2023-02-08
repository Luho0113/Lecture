package exceptionEx_07;

public class B {

	public void b1() throws ArithmeticException, ClassNotFoundException {
		b2();
	}

	public void b2() throws ArithmeticException, ClassNotFoundException {
		int a = 10 / 0;
		b3();
	}

	public void b3() throws  ClassNotFoundException {
		Class.forName("java.lang.String");
		b4();
	}

	public void b4() {

	}

}
