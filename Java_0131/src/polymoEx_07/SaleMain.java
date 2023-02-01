package polymoEx_07;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// 메인: 스캐너로 입력받기 + 메뉴 출력하기
		Scanner sc = new Scanner(System.in);
		
		SaleBusiness SB = new SaleBusiness();
		
		System.out.println("--------------------");
		System.out.println("판매량 관리 프로그램");
		System.out.println("--------------------");
		
		int menu = 0; //메뉴 선택
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1. 입력   2. 출력   3. 종료");
			System.out.println("--------------------------");
			
			System.out.print("메뉴를 선택해주세요 > ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: SB.input(); break;
				case 2 : SB.ouput(); break;
				case 3: 
					System.out.println("프로그램이 종료되었습니다."); break;
				default : 
					System.out.println("잘못된 입력입니다."); break;
			}
			
			
		}
		

	}

}
