package ch17Ex_07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// ���� �߿��� ������ �������� Member�� ������ List�� ����
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"), 
				new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������"));

		List<Member> developers = list.stream()
		.filter(s -> s.getJob().equals("������"))
		.collect(Collectors.toList());

		developers.stream().forEach(m -> System.out.println(m.getName()));
	}

}
