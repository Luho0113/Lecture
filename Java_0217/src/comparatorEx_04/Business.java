package comparatorEx_04;

public class Business {
	private String central; //���� �Ҽ�
	private String storeLocation; //������ġ
	private Integer sales; //�ǸŽ���
	
	public Business(String central, String storeLocation, Integer sales) {
		this.central = central;
		this.storeLocation = storeLocation;
		this.sales = sales;
	}

	//���ͼ���
	public String getCentral() {
		return central;
	}

	public void setCentral(String central) {
		this.central = central;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}
	
	
}
