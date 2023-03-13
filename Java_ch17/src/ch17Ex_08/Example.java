package ch17Ex_08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// Ű=����, ��=�ش� ������ ���� Member���� �����ϰ� �ִ� List
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"), 
				new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������"));

		Map<String, List<Member>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(s -> s.getJob()));

		System.out.println("[������]");
		groupingMap.get("������").stream().forEach(s -> System.out.println(s));
		System.out.println();

		System.out.println("[�����̳�]");
		groupingMap.get("�����̳�").stream().forEach(s -> System.out.println(s));
	}

}
