package ch13Ex_02;

public class ContainerExample {

	public static void main(String[] args) {
		//�޼ҵ带 �����ؼ� Container ���׸� Ÿ���� �����غ���
		
		Container<String> container1 = new Container<String>();
		container1.set("ȫ�浿");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);

	}

}
