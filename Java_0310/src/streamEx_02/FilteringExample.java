package streamEx_02;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		// ���̰� 20�� �̸��� �л��� ����ϱ�
		List<Student> list = Arrays.asList(
				new Student("�л�1", 10),
				new Student("�л�2", 15),
				new Student("�л�3", 20),
				new Student("�л�4", 25),
				new Student("�л�5", 30)
		);
		
		list.stream()
		.filter(age-> age.getAge()<20)
		.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
		System.out.println();
		
		//���� ��, ���̰� 20�� �л��� ����ϱ�
		List<Student> list2 = Arrays.asList(
				new Student("���л�", 10),
				new Student("���л�", 15),
				new Student("���л�", 20),
				new Student("���л�", 25),
				new Student("���л�", 30)
		);
		
		list2.stream()
		.distinct()
		.filter(n -> n.getName().startsWith("��") && n.getAge() == 20)
		.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
	}

}
