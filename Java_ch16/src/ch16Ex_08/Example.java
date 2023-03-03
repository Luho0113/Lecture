package ch16Ex_08;

public class Example {
	private static Student[] students = { new Student("ȫ�浿", 90, 96), new Student("�ſ��", 95, 93) };

	// avg() �޼ҵ� �ۼ�
	public static double avg(Function<Student> function) {
		//Function<Student> function = s
		int sum = 0;
		
		for (Student student : students) {
			//sum += student.getEnglishScore();
			sum += function.apply(student);
		}
		double avg = (double) sum/students.length; //sum/2

		return avg;
		
	}
	
	
	
	public static void main(String[] args) {
		//s = Student Ŭ������ ���� ����
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("���� ��� ����: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("���� ��� ����: " + mathAvg);
	}
}
