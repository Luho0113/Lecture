package ch06Ex;

public class Account {
	//19번
	private int balance; //정책: 0<=balance <=1000000
	
	//상수 선언
	//제한자 자료형 상수명 = 초기값;
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
