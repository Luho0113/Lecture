package streamEx_01;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// ��Ҹ� �ϳ��� ó��
		// ���� ��Ʈ������ ¦���� �ϳ��� ó���ϱ�
		int[] intArr = {1,2,3,4,5};
		
		//�߸� �ۼ��ϴ� ��� (���� ó���� �����Ƿ� �������� ����)
		// peek = �߰� ��Ʈ��
		// Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
		System.out.println();
		
		// �߰�ó�� �޼ҵ� peek()�� �̿��ؼ� �ݺ�ó��
		int total = Arrays.stream(intArr)
		.filter(a -> a % 2 == 0) //¦���� true
		.peek(n -> System.out.println(n)) //true���� ��� -> �ݺ�
		.sum(); //���� �Լ��� ���� ó��
		System.out.println("���� : " + total + "\n");
		
		//���� ó�� �޼ҵ� forEach()�� �̿��ϴ� ���
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));

	}

}
