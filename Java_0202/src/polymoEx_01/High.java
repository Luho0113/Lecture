package polymoEx_01;

public class High extends Middle{
	//�ڽ�Ŭ����: ����л�
	
	private double standardDevi; //ǥ������
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("����б� ���� ���");
		System.out.println("---------------------");
		
		System.out.println("�����: " + getSubject());
		System.out.println("��米��: " + getTeacher());
		System.out.println("�߰����: " + getMidExam() + " / " + "�⸻���: " + getFinalExam());
		System.out.println("������: " + getPerEvalution());
		System.out.println("�⼮: " + getAttendance());
		System.out.println("����: " + getVolunteer());
		System.out.println(">> �̹� �б� ����: " + getScore() + " / ǥ������: " + getStandardDevi());
	}
	
	@Override
	public String toString() {
		return "����л�";
	}

	
	
	//settergetter
	public double getStandardDevi() {
		return standardDevi;
	}

	public void setStandardDevi(double standardDevi) {
		this.standardDevi = standardDevi;
	}
	
	
}
