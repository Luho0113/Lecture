package polymoEx_06;

public class Product {
	//�θ� Ŭ����
	
	int price;
	int bonusPoint;
	
	//������
	public Product() {	}
	
	
	//����� ������
	public Product(int price) {
		this.price=price;
		bonusPoint = (int) (price/10.0);
	}

}
