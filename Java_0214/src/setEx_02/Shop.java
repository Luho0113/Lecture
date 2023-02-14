package setEx_02;

public class Shop {

	private String custName; //�� �̸�
	private String custPhone; //�� ��ȭ��ȣ
	private int point; //����Ʈ

	public Shop(String custName, String custPhone, int point) {
		super();
		this.custName = custName;
		this.custPhone = custPhone;
		this.point = point;
	}

	
	//�ؽ��ڵ� ������
	@Override
	public int hashCode() {
		
		return custName.hashCode() + custPhone.hashCode() + point;
	}
	
	
	//equals() ������
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Shop target) {
			//Shop shop = (Shop) obj;
			return target.custName.equals(custName) && target.custPhone.equals(custPhone);
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	//���ͼ���
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
