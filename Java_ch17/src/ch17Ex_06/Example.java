package ch17Ex_06;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// Member�� ��� ���̸� ���

		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", 30), 
				new Member("�ſ��", 40), 
				new Member("���ڹ�", 26));
		
		double avg = list.stream().mapToDouble(Member::getAge).average().getAsDouble();

		System.out.println("��� ����: " + avg);

	}

}
