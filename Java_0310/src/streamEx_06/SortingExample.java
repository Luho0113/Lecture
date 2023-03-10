package streamEx_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// ���� ��ü�� ����
		
		//List �÷��� ����
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 30),
				new Student("�ſ��", 10),
				new Student("���̼�", 20)
		);
		
		//������ �������� �������� ������ �� ��Ʈ�� ���
		studentList.stream()
		.sorted()
		.forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//������ �������� �������� ������ �� ��Ʈ�� ���
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getName() + ": " + s.getScore()));

	}

}
