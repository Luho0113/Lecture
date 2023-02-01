package polymoEx_07;

public class Product {
	//부모 클래스
	int productPrice; //제품 가격
	int salesCnt; //판매량
	int total;
	String companyName;
	String productName;

	
	//기본 생성자
	public Product() { }
	
	//입력받을거...?
	public Product (int productPrice, int salesCnt) {
		this.productPrice = productPrice;
		this.salesCnt = salesCnt;
		total = productPrice*salesCnt;
			
	}
	

}
