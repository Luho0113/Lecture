package ch13Ex_04;

public class UtilExample {

	public static void main(String[] args) {
		//첫번째 매개값으로 Pair타입과 하위타입만 받고 두번째 매개값으로 키값을 받음
		//키값이 일치할 경우 Pair에 저장된 값을 리턴하고 일치하지 않으면 null을 리턴하도록 함
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);

	}

}
