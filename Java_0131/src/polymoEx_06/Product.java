package polymoEx_06;

public class Product {
	//부모 클래스
	
	int price;
	int bonusPoint;
	
	//생성자
	public Product() {	}
	
	
	//명시적 생성자
	public Product(int price) {
		this.price=price;
		bonusPoint = (int) (price/10.0);
	}

}
