package ch07Ex_07;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("ȫ�浿"); //���ڿ��� ���� �� �ִ� �θ��� �⺻ �����ڸ� ȣ��
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name call");
	}
}
