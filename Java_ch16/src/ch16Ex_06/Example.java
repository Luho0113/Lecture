package ch16Ex_06;

public class Example {
	//apply메소드를 보고 Function 함수형 인터페이스 작성하기
	
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y); //참조변수.메소드()
	}

	public static void main(String[] args) {

		double result = calc((x, y) -> (x / y)); //Function fun = (x, y) -> (x/y)
		System.out.println("result: " + result);
	}
}
