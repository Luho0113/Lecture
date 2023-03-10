package streamEx_03;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// ����
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("ȫ�浿", 85));
		studentList.add(new Student("ȫ�浿", 92));
		studentList.add(new Student("ȫ�浿", 87));
		
		//Student�� score ��Ʈ������ ��ȯ�ϱ�
		studentList.stream()
		.mapToInt(s->s.getScore())
		.forEach(score->System.out.println(score));
		
		//double ��Ʈ������ ��ȯ�ϱ�
		List<Student2> studentList2 = new ArrayList<>();
		studentList2.add(new Student2("ȫ�浿", 2.5));
		studentList2.add(new Student2("ȫ�浿", 1.5));
		studentList2.add(new Student2("ȫ�浿", 0.5));
		studentList2.stream()
		.mapToDouble(s->s.getEye())
		.forEach(eye->System.out.println(eye));
		

	}

}
