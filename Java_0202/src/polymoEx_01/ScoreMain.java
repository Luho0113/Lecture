package polymoEx_01;

import java.util.Scanner;

public class ScoreMain {
	static Scanner sc; //�������� (��� �޼ҵ尡 ��밡���ϵ��� �����ϴ� �� != ��������)
	static int menu;
	static ScoreBusiness sb; //����Ͻ� Ŭ������ �ּ�
	
	public static void main(String[] args) {
		// ����Ͻ� Ŭ���� ȣ���ϱ�, ���� �޴� ȭ�� �����, ����Ͻ� Ŭ���� ȣ���ϱ�
		
		//������ ���
		Score e1 = new Elementary();
		Score m1 = new Middle();
		Score h1 = new High();
		
		//����Ͻ� Ŭ���� ��ü ����
		sb = new ScoreBusiness();
				
		
		sc = new Scanner(System.in);
		boolean end = false;
		//���� �޴� ȭ�� + �޴� ����
		do {
			
			menu = 0;
			end = false;
			
			System.out.println("-----------------------------------");
			System.out.println("1. �ʵ��б� 2. ���б� 3. ����б� 4. ����");
			System.out.println("-----------------------------------");
			System.out.print("�޴� ���� > ");
			menu = sc.nextInt();
			
			switch(menu) {
			
				case 1 :
					elementary(e1); //��ü�� �ּ�(e1)�� �ش� �޼ҵ�� ����
					break;
					
				case 2 :
					middle(m1); 
					break;
					
				case 3 :
					high(h1); 
					break;
					
				case 4 :
					end = true;
					System.out.println("����ƽ��ϴ�."); 
					break;
					
				default : 
					System.out.println("�߸��� �Է��Դϴ�."); 
					break;
					
			}
			
		}while(!end);

	} //main() ����
	
	
	//�޴� �Է�
	private static void high(Score h1) { //Ÿ�� ������
		boolean end = false;
		do {
			System.out.println("-----------------------------------");
			System.out.println("����б� �������� ���α׷�");
			System.out.println("-----------------------------------");
			System.out.println("1.�Է� 2. ��� 3. �������� ���ư���");
			System.out.print("���� > ");
			
			menu = sc.nextInt();
			
			switch(menu) {
				case 1 : 
					sb.input(h1); 
					break;
				case 2 : 
					sb.print(h1); 
					break;
				case 3 :
					end = true;
					break;
			}
		} while( !end );
		
	}

	private static void middle(Score m1) {
		boolean end = false;
		do {
			System.out.println("-----------------------------------");
			System.out.println("���б� �������� ���α׷�");
			System.out.println("-----------------------------------");
			System.out.println("1.�Է� 2. ��� 3. �������� ���ư���");
			System.out.print("���� > ");
			
			menu = sc.nextInt();
			
			switch(menu) {
				case 1 : 
					sb.input(m1); 
					break;
				case 2 : 
					sb.print(m1); 
					break;
				case 3 :
					end = true;
					break;
			}
		} while( !end );
		
	}

	private static void elementary(Score e1) {
		boolean end = false;
		do {
			System.out.println("-----------------------------------");
			System.out.println("�ʵ��б� �������� ���α׷�");
			System.out.println("-----------------------------------");
			System.out.println("1.�Է� 2. ��� 3. �������� ���ư���");
			System.out.print("���� > ");
			
			menu = sc.nextInt();
			
			switch(menu) {
				case 1 : 
					sb.input(e1); 
					break;
				case 2 : 
					sb.print(e1); 
					break;
				case 3 :
					end = true;
					break;
			}
		} while( !end );
	}

}
