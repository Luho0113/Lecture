package insufficienEx_01;

public class InsufficientException extends Exception {
	//�ܰ���� ���ܸ� ����� ���� ���� Ŭ������ ���� (�Ϲݿ���)

	public InsufficientException() {
		//�⺻ ������
	}

	public InsufficientException(String message) {
		//���� �޼����� �Է¹޾� �θ� �������� �Ű������� �Ѱ��� ������
		super(message);
	}

}
