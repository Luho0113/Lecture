package streamEx_02;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		// ��� ���� ���� ����
		
		int[] intArr = {2,4,6};
		
		//��� 2�� ����̸� ���� ���
		boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("��� 2�� ������� : " + result);
		
		result = Arrays.stream(intArr).anyMatch(a->a%2==0);
		System.out.println("�ϳ��� 2�� ����� �ִ��� : " + result);
		
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println("�ϳ��� 3�� ����� �ִ��� : " + result);
		
		result = Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3�� ����� ������ : " + result);
	}

}
