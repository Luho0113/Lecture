package setEx_02;

public class Shop {

	private String custName; //고객 이름
	private String custPhone; //고객 전화번호
	private int point; //포인트

	public Shop(String custName, String custPhone, int point) {
		super();
		this.custName = custName;
		this.custPhone = custPhone;
		this.point = point;
	}

	
	//해시코드 재정의
	@Override
	public int hashCode() {
		
		return custName.hashCode() + custPhone.hashCode() + point;
	}
	
	
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Shop target) {
			//Shop shop = (Shop) obj;
			return target.custName.equals(custName) && target.custPhone.equals(custPhone);
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	//게터세터
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

}
