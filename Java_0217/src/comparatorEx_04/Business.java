package comparatorEx_04;

public class Business {
	private String central; //본부 소속
	private String storeLocation; //매장위치
	private Integer sales; //판매실적
	
	public Business(String central, String storeLocation, Integer sales) {
		this.central = central;
		this.storeLocation = storeLocation;
		this.sales = sales;
	}

	//게터세터
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
