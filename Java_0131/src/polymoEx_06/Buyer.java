package polymoEx_06;

public class Buyer {
	//물건을 사는 손님에 대한 클래스
	
	int money = 1000;
	int bonusPoint = 0;
	
	//상품을 여러 개 저장하기 위한 배열을 생성함
	Product[] item = new Product[10]; //총 구입 개수는 10개로 지정
	int i = 0;
	
	//구입하는 메소드
	void buy (Product p) { //매개변수 p
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return; //반복문을 나가는 용도
		}
		money = money - p.price; // money -= p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i++] = p; //item의 0열에 p의 주소를 넣어주고 i++
		System.out.println( p +"을/를 구매하셨습니다.");
	}
	
	//구입한 물품과 총 금액을 보여주는 메소드
	void summary() {
		int sum = 0;
		int bonusSum = 0;
		
		System.out.println("========================");
		System.out.print("구입하신 제품은 ");
		// String itemList = " "; 
		for (int i = 0; i < item.length; i++ ) { //배열의 길이만큼 for문을 수행
			if (item[i] == null) break;
			sum = sum + item[i].price;
			bonusSum += item[i].bonusPoint;
			
			System.out.print(item[i]);
			if (item[i] != null) {
				System.out.print(", ");
			}
			
			// itemList += item[i] + ", "; //itemList에 문자열을 모으는 것
		}
		System.out.println("입니다.");
		System.out.println("구입한 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("총 포인트는 " + bonusSum + "point 입니다.");
		// ystem.out.println("구입하신 제품은 (" + itemList + ") 입니다.");
	}

}
