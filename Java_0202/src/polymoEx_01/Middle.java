package polymoEx_01;

public class Middle extends Score {
	//�ڽ�Ŭ����: ���л�
	
	private String teacher; //��米���
	private int attendance; //�⼮����
	private int volunteer; //��������
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("���б� ���� ���");
		System.out.println("---------------------");
		
		System.out.println("�����: " + getSubject());
		System.out.println("��米��: " + getTeacher());
		System.out.println("�߰����: " + getMidExam() + " / " + "�⸻���: " + getFinalExam());
		System.out.println("������: " + getPerEvalution());
		System.out.println("�⼮: " + getAttendance());
		System.out.println("����: " + getVolunteer());
		System.out.println(">> �̹� �б� ����: " + getScore());
	}
	
	@Override
	public String toString() {
		return "���л�";
	}


	
	
	//settergetter
	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public int getAttendance() {
		return attendance;
	}


	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}


	public int getVolunteer() {
		return volunteer;
	}


	public void setVolunteer(int volunteer) {
		this.volunteer = volunteer;
	}
	
	
}
