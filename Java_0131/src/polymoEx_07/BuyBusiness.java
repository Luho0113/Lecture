package polymoEx_07;

import java.util.Scanner;

public class BuyBusiness {
	
	Scanner sc = new Scanner(System.in);
	
	//������ ���� �迭 ����
	Product[] item = new Product[10];
	int i = 0;
	
	
	//���α׷� ���� �޼ҵ�
	void sales(Product p) {
		System.out.println("--------------------");
		System.out.println("�Ǹŷ� ���� ���α׷�");
		System.out.println("--------------------");
		
		while (true) {
			int menu = 0; //�޴� ����
			String input = null; //���� ��� ����
			
			String chooseCompany = null; //���� ����
			
			String chooseProduct = null; //��ǰ ����
			
			int salesComputer = 0; //��ǻ�� �Ǹŷ�
			int salesPrinter = 0; //������ �Ǹŷ�
			
			
			System.out.println("--------------------");
			System.out.println("1. �Է�   2. ���   3. ����");
			System.out.println("--------------------");

			
			System.out.print("�޴��� �������ּ��� > ");
			menu = sc.nextInt();
			sc.nextLine();
			
			//�޴� ����
			switch (menu) {
				case 1 : //�Է�
					System.out.print("���� ���� > ");
					chooseCompany = sc.nextLine();
					p.companyName = chooseCompany;
					
					System.out.print("��ǰ ���� > ");
					chooseProduct = sc.nextLine();
					p.productName = chooseProduct;
					
					
					System.out.print(chooseProduct + "�� �ǸŶ� �Է� > ");
					if (chooseProduct.equals("��ǻ��")) {
						salesComputer = sc.nextInt();
						p.salesCnt = salesComputer;
						p.total = p.productPrice*p.salesCnt;
					}
					if (chooseProduct.equals("������")) {
						salesPrinter = sc.nextInt();
						p.salesCnt = salesPrinter;
						p.total = p.productPrice*p.salesCnt;
					}
					
					for (int i = 0; i < item.length; i++) {
						if (item[i] == null) break;
						item[i] = item[i].companyName;
					}
					
					
					input = sc.nextLine().toUpperCase();
					System.out.println("��� �Է��Ͻðڽ��ϱ�? (Y/N)");
					sc.nextLine();
					if (input.equals("Y")) {
						System.out.println("--------------------");
						System.out.println("�Ǹŷ� ���� ���α׷�");
						System.out.println("--------------------");
						System.out.println("1. �Է�   2. ���   3. ����");
						continue;
					} if (input.equals("N")){
						sc.nextLine();
						break;
					} 
					
					break;
				case 2 : //���
					System.out.println("--------------------");
					System.out.println("�� ���纰 �Ǹ� ��Ȳ");
					System.out.println("--------------------");
					System.out.println("����� ��ǰ�� ��ǰ���� �Ǹŷ� ������Ȳ");
					System.out.println(p.companyName + " " + p.productName + " " + p.productPrice + " " + p.salesCnt + " " + p.total);
					
					
					break;
				case 3 : //����
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break;
				default : System.out.println("�߸��� �Է��Դϴ�."); break;
			}
			
		}
		
	}

}
