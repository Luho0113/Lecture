package polymoEx_01;

public class Elementary extends Score {
	//�ڽ�Ŭ����: �ʵ��л�
	
	@Override
	void printAll() {
		System.out.println("---------------------");
		System.out.println("�ʵ��б� ���� ���");
		System.out.println("---------------------");
		
		System.out.println("�����: " + getSubject());
		System.out.println("�߰����: " + getMidExam() + " / " + "�⸻���: " + getFinalExam());
		System.out.println("������: " + getPerEvalution());
		System.out.println(">> �̹� �б� ����: " + getScore());
	}
	
	@Override
	public String toString() {
		return "�ʵ��л�";
	}

}
