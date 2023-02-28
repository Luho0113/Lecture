package genericEx_03;

public class Course {
	//��� ����̸� ��� ������ �ڽ�
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
		+ "�̰� Course1�� �����");
		
	}
	
	
	//�л��� ��� ������ �ڽ�
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
		+ "�̰� Course2�� �����");
		
	}
	
	
	//������ �� �Ϲ��θ� ��� ������ �ڽ�
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
		+ "�̰� Course3�� �����");
		
	}
	
	
}
