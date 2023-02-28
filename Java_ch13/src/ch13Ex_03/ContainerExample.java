package ch13Ex_03;

public class ContainerExample {

	public static void main(String[] args) {
		// main() 메소드를 참고해서 Contatiner 제네릭 타입을 선언
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + " " +  job);
		
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + " " +  age);

	}

}
