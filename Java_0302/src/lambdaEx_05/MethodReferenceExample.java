package lambdaEx_05;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// 객체 생성
		Person person = new Person();
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		
		//정적 메소드인 경우
		//람다식
		person.action((double x, double y)->{return Computer.staticMethod(x, y);});
		person.action((x, y)->Computer.staticMethod(x, y));
		//메소드 참조
		person.action(Computer::staticMethod);
		
		
		//인스턴스 메소드인 경우
		Computer computer = new Computer();
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return computer.staticMethod(x, y);
			}
		});
		//람다식
		person.action((x,y) -> computer.instanceMethod(x, y));
		//메소드 참조 (참조변수의 메소드를 호출)
		person.action(computer::instanceMethod);

	}

}
