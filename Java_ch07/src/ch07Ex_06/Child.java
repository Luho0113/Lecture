package ch07Ex_06;

public class Child extends Parent{
	public int studentNo;
	
	//2���� �Ű������� ������ ������
	public Child(String name, int studentNo) {
		
		super(name); //��� 1. �θ��� �����ڸ� ȣ��
		
		this.studentNo = studentNo;
		
		//super(name), super(name, studentNo)�� �ڵ����� �����ϵǴµ� studentNo�� �θ�Ŭ������ �����Ƿ� �����߻�
		//�ƿ� �θ� Ŭ������ �����ڰ� ���ٸ�, �ڹٿ��� �ڵ����� �⺻ �����ڸ� �θ�Ŭ������ ��������
		//�Ǵ� �ƿ� ó������ �θ� Ŭ������ �⺻ �����ڸ� �����ΰ� ����
	}
}
