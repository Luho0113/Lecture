package InterfaceEx_02;

public interface InConfig {
	//�������̽��� ���� �� �ִ� ��
	
	//1. �޼ҵ�
	void i1();
	//2. ���
	static final double PI = 3.14;
	static final boolean OK = true;
	//3. default �޼ҵ� - {�����}�� ����� �� �ְ� �ڹٿ��� ������ִ� ��
	default void defaultM() { }
	//4. ���� �޼ҵ� (static)
	static void staticM() { }
	//5. private - �������̽� �ȿ����� ��� ����
	private void privateM() { }

}
