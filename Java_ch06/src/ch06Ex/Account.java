package ch06Ex;

public class Account {
	//19��
	private int balance; //��å: 0<=balance <=1000000
	
	//��� ����
	//������ �ڷ��� ����� = �ʱⰪ;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//getter setter
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		}
		//if (!(balance<=MIN_BALANCE || balance>=MAX_BALANCE));
		
	}
	
	
}
