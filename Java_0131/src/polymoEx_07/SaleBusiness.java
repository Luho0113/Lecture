package polymoEx_07;

import java.util.Scanner;

public class SaleBusiness {
	
	//������ ��ü���� �ּҰ� ��������� > �ٸ� �޼ҵ忡�� �ּҸ� �����ٰ� �� �� �ְ� ��
	Scanner sc;
	
	Company seoul;
	Company gyeongin;
	Company gangwon;
	Company jeju;
	
	//�⺻ ������
	public SaleBusiness() {
		sc = new Scanner(System.in);
		
		//Comany ��ü ����
		seoul = new Seoul();
		gyeongin = new Gyeongin();
		gangwon = new Gangwon();
		jeju = new Jeju();
	}
	
	
	
	//������ ���� �迭 ����
	Product[] item = new Product[10];

	String input = null; //���� ��� ����
	

	//1�� �Է� ��� �޼ҵ�
	public void input() {
		String choice = "n";
		
		do {
			System.out.println("--------------------------");
			System.out.println("�Է��Ͻ� ���縦 �������ֽʽÿ�.");
			System.out.println("1. �������� 2. �������� 3. �������� 4. ��������");
			System.out.println("--------------------------");
			System.out.print("���� ���� > ");
			
			int companySelect = 0;
			companySelect = sc.nextInt();
			switch(companySelect) {
				case 1: companyInput(seoul); break;
				case 2: companyInput(gyeongin); break;
				case 3: companyInput(gangwon); break;
				case 4: companyInput(jeju); break;
			}

			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (Y/N)");
			choice = sc.nextLine().toUpperCase();
		} while(choice.equals("Y"));
		
		
	}
	
	//���� ���� �� ��ǰ�� ��ǰ�� �Է� �޼ҵ�
	private void companyInput(Company company) { //�Ű�����: �ڽ��� �ּҸ� �θ� Ÿ������ �޾ƿ�
		System.out.print("��ǰ �Է� > ");
		
		if (company instanceof Seoul) {
			//�ٿ�ĳ����
			seoul = (Seoul) company;
			
			company.setProductName(sc.next()); //��ǰ �̸� �Է�
			sc.nextLine();
			System.out.print(seoul + " " + seoul.getProductName() + "�Ǹŷ� �Է� > " );
			company.setSaleAmount(sc.nextInt()); // �Ǹŷ� �Է�
			sc.nextLine();
			
			
			System.out.println(">> �Է� ���: " + seoul + "����/ " + seoul.getProductName() + " / �Ǹŷ�" +  seoul.getSaleAmount());
			
			//�޼ҵ� ȣ�� - ��ǰ�� �Ǹŷ� ���� �޾ƿͼ� ������Ȳ�� �־���
			seoul.setSaleStatus( saleStatusMethod( seoul.getProductName(), seoul.getSaleAmount() ) );
			//�޼ҵ� ȣ�� - ��ǰ ������ �޾ƿͼ� ���� ��Ȳ�� �־���
			seoul.setProductPrice( priceInput( seoul.getProductName() ) );
		}
		
		
		if (company instanceof Gangwon) {
			gangwon = (Gangwon) company;
			
			company.setProductName(sc.next());
			sc.nextLine();
			System.out.print(gangwon + " " + gangwon.getProductName() + "�Ǹŷ� �Է� > " );
			company.setSaleAmount(sc.nextInt());
			sc.nextLine();
			System.out.println(">> �Է� ���: " + gangwon + "���� / " + gangwon.getProductName() + " / �Ǹŷ� " +  gangwon.getSaleAmount());
			
			gangwon.setSaleStatus( saleStatusMethod( gangwon.getProductName(), gangwon.getSaleAmount() ) );
			gangwon.setProductPrice( priceInput( gangwon.getProductName() ) );
		}
		
		if (company instanceof Gyeongin) {
			gyeongin = (Gyeongin) company;
			
			company.setProductName(sc.next());
			sc.nextLine();
			System.out.print(gyeongin + " " + gyeongin.getProductName() + "�Ǹŷ� �Է� > " );
			company.setSaleAmount(sc.nextInt());
			sc.nextLine();
			System.out.println(">> �Է� ���: " + gyeongin + "����/ " + gyeongin.getProductName() + " / �Ǹŷ�" +  gyeongin.getSaleAmount());
		
			gyeongin.setSaleStatus( saleStatusMethod( gyeongin.getProductName(), gyeongin.getSaleAmount() ) );
			gyeongin.setProductPrice( priceInput( gyeongin.getProductName() ) );
		}
		
		if (company instanceof Jeju) {
			jeju = (Jeju) company;
			
			company.setProductName(sc.next()); 
			sc.nextLine();
			System.out.print(jeju + " " + jeju.getProductName() + "�Ǹŷ� �Է� > " );
			company.setSaleAmount(sc.nextInt()); 
			sc.nextLine();
			System.out.println(">> �Է� ��� " + jeju + "����/ " + jeju.getProductName() + " / �Ǹŷ�" +  gyeongin.getSaleAmount());
		
			jeju.setSaleStatus( saleStatusMethod( jeju.getProductName(), jeju.getSaleAmount() ) );
			jeju.setProductPrice( priceInput( jeju.getProductName() ) );
		}

	}

	
	
	//2�� ��� ��� �޼ҵ�
	public void ouput() {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("�� ���纰 �Ǹ� ��Ȳ");
		System.out.println("--------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "�����", "��ǰ��", "��ǰ����", "�Ǹŷ�", "������Ȳ");
		
		System.out.printf
		("%12s %10s %10s %10s %10s\n", seoul, seoul.getProductName(), seoul.getProductPrice(), seoul.getSaleAmount(), seoul.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", gangwon, gangwon.getProductName(), gangwon.getProductPrice(), gangwon.getSaleAmount(), gangwon.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", gyeongin, gyeongin.getProductName(), gyeongin.getProductPrice(), gyeongin.getSaleAmount(), gyeongin.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", jeju, jeju.getProductName(), jeju.getProductPrice(), jeju.getSaleAmount(), jeju.getSaleStatus());
		

	
	
	}
	
	
	
	//3�� ������Ȳ ��� �޼ҵ� (��ǰ��� �Ǹŷ��� �޾ƿͼ� total���� ����ؼ� ������)
	private int saleStatusMethod(String productName, int saleAmount) {
		int total = 0; //������Ȳ
		
		if(productName.equals("��ǻ��")) {
			total = 2000000 * saleAmount;
		} else if (productName.equals("������")) {
			total = 500000 * saleAmount;
		} else {
			System.out.println("��ǰ�� �߸� �Է��߽��ϴ�.");
		}
		
		return total;
	}
	
	//��ǰ���� �޼ҵ� (��ǰ���� �޾ƿͼ� ��ǰ������ ����)
	private int priceInput(String productName) {
		if(productName.equals("��ǻ��")) return 2000000;
		else if (productName.equals("������")) return 500000;
		
		return 0;
	}
	

}
