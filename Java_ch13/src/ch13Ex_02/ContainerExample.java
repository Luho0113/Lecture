package ch13Ex_02;

public class ContainerExample {

	public static void main(String[] args) {
		//메소드를 참고해서 Container 제네릭 타입을 선언해보기
		
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);

	}

}
