package polymoEx_07;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// ����: ��ĳ�ʷ� �Է¹ޱ� + �޴� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		SaleBusiness SB = new SaleBusiness();
		
		System.out.println("--------------------");
		System.out.println("�Ǹŷ� ���� ���α׷�");
		System.out.println("--------------------");
		
		int menu = 0; //�޴� ����
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1. �Է�   2. ���   3. ����");
			System.out.println("--------------------------");
			
			System.out.print("�޴��� �������ּ��� > ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: SB.input(); break;
				case 2 : SB.ouput(); break;
				case 3: 
					System.out.println("���α׷��� ����Ǿ����ϴ�."); break;
				default : 
					System.out.println("�߸��� �Է��Դϴ�."); break;
			}
			
			
		}
		

	}

}
