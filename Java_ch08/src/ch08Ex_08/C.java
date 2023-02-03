package ch08Ex_08;

public class C implements A {
	@Override
	public void method1() {
		System.out.println("C의 method1");

	}
	
	//C만의 메소드
	public void method2() {
		System.out.println("C의 method2");
	}
}
