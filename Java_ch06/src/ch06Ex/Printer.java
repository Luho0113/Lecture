package ch06Ex;

public class Printer {
	//16번 println() 메소드를 오버로딩하여 선언
	static void  println (int number) {
		System.out.println(number);
	}
	
	static void println(boolean tf) {
		System.out.println(tf);
	}
	
	static void println(double number2) {
		System.out.println(number2);
	}
	
	static void println (String name) {
		System.out.println(name);
	}
}
