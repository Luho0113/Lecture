package polymoEx_07;

public class Product {
	//�θ� Ŭ����
	int productPrice; //��ǰ ����
	int salesCnt; //�Ǹŷ�
	int total;
	String companyName;
	String productName;

	
	//�⺻ ������
	public Product() { }
	
	//�Է¹�����...?
	public Product (int productPrice, int salesCnt) {
		this.productPrice = productPrice;
		this.salesCnt = salesCnt;
		total = productPrice*salesCnt;
			
	}
	

}
