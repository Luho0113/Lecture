package polymoEx_06;

public class Buyer {
	//������ ��� �մԿ� ���� Ŭ����
	
	int money = 1000;
	int bonusPoint = 0;
	
	//��ǰ�� ���� �� �����ϱ� ���� �迭�� ������
	Product[] item = new Product[10]; //�� ���� ������ 10���� ����
	int i = 0;
	
	//�����ϴ� �޼ҵ�
	void buy (Product p) { //�Ű����� p
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return; //�ݺ����� ������ �뵵
		}
		money = money - p.price; // money -= p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[i++] = p; //item�� 0���� p�� �ּҸ� �־��ְ� i++
		System.out.println( p +"��/�� �����ϼ̽��ϴ�.");
	}
	
	//������ ��ǰ�� �� �ݾ��� �����ִ� �޼ҵ�
	void summary() {
		int sum = 0;
		int bonusSum = 0;
		
		System.out.println("========================");
		System.out.print("�����Ͻ� ��ǰ�� ");
		// String itemList = " "; 
		for (int i = 0; i < item.length; i++ ) { //�迭�� ���̸�ŭ for���� ����
			if (item[i] == null) break;
			sum = sum + item[i].price;
			bonusSum += item[i].bonusPoint;
			
			System.out.print(item[i]);
			if (item[i] != null) {
				System.out.print(", ");
			}
			
			// itemList += item[i] + ", "; //itemList�� ���ڿ��� ������ ��
		}
		System.out.println("�Դϴ�.");
		System.out.println("������ ��ǰ�� �� �ݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�� ����Ʈ�� " + bonusSum + "point �Դϴ�.");
		// ystem.out.println("�����Ͻ� ��ǰ�� (" + itemList + ") �Դϴ�.");
	}

}
