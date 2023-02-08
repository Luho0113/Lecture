package insufficienEx_01;

public class Account {
	
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		balance = balance + money;
	}
	
	//��� �޼ҵ�
	public void withdraw(int money) throws InsufficientException {
		                            //ȣ���� ������ �߻���Ų ���ܸ� ���ѱ�
		if ( balance < money ) {
			//���� ����
			throw new InsufficientException("�ܰ� ����: " + (money - balance) + "�� ���ڶ�");
		}
		balance = balance - money;
	}

}
