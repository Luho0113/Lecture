package ch16Ex_09;

import ch16Ex_08.Function;
import ch16Ex_08.Student;

public class Example {
	private static Student[] students = { new Student("ȫ�浿", 90, 96), new Student("�ſ��", 95, 93) };

	// avg() �޼ҵ� �ۼ�
	public static double avg(Function<Student> function) {
		int sum = 0;
		
		for (Student student : students) {
			sum += function.apply(student);
		}
		double avg = (double) sum/students.length;

		return avg;
		
	}

	public static void main(String[] args) {
		//�޼ҵ��� �Ű����� �޼ҵ� ������ �����ϱ�
		double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("���� ��� ����: " + englishAvg);

		double mathAvg = avg(Student :: getMathScore);
		System.out.println("���� ��� ����: " + mathAvg);
	}
}
