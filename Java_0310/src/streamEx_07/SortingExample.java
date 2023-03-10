package streamEx_07;

import java.util.Arrays;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//Comparator�� �̿��� ����
		
		//List �÷��� ����
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 30), 
				new Student("�ſ��", 10),
				new Student("���̼�", 20)
		);
		
		//������ �������� ������������ ����
		studentList.stream().sorted((s1, s2)->Integer.compare(s1.getScore(), s2.getScore())).forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//������ �������� �������� ����
		studentList.stream().sorted((s1, s2)->Integer.compare(s2.getScore(), s1.getScore())).forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		

	}

}
