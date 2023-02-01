package polymoEx_07;

import java.util.Scanner;

public class BuyBusiness {
	
	Scanner sc = new Scanner(System.in);
	
	//저장을 위한 배열 생성
	Product[] item = new Product[10];
	int i = 0;
	
	
	//프로그램 실행 메소드
	void sales(Product p) {
		System.out.println("--------------------");
		System.out.println("판매량 관리 프로그램");
		System.out.println("--------------------");
		
		while (true) {
			int menu = 0; //메뉴 선택
			String input = null; //선택 계속 여부
			
			String chooseCompany = null; //지사 선택
			
			String chooseProduct = null; //제품 선택
			
			int salesComputer = 0; //컴퓨터 판매량
			int salesPrinter = 0; //프린터 판매량
			
			
			System.out.println("--------------------");
			System.out.println("1. 입력   2. 출력   3. 종료");
			System.out.println("--------------------");

			
			System.out.print("메뉴를 선택해주세요 > ");
			menu = sc.nextInt();
			sc.nextLine();
			
			//메뉴 선택
			switch (menu) {
				case 1 : //입력
					System.out.print("지사 선택 > ");
					chooseCompany = sc.nextLine();
					p.companyName = chooseCompany;
					
					System.out.print("제품 선택 > ");
					chooseProduct = sc.nextLine();
					p.productName = chooseProduct;
					
					
					System.out.print(chooseProduct + "의 판매랑 입력 > ");
					if (chooseProduct.equals("컴퓨터")) {
						salesComputer = sc.nextInt();
						p.salesCnt = salesComputer;
						p.total = p.productPrice*p.salesCnt;
					}
					if (chooseProduct.equals("프린터")) {
						salesPrinter = sc.nextInt();
						p.salesCnt = salesPrinter;
						p.total = p.productPrice*p.salesCnt;
					}
					
					for (int i = 0; i < item.length; i++) {
						if (item[i] == null) break;
						item[i] = item[i].companyName;
					}
					
					
					input = sc.nextLine().toUpperCase();
					System.out.println("계속 입력하시겠습니까? (Y/N)");
					sc.nextLine();
					if (input.equals("Y")) {
						System.out.println("--------------------");
						System.out.println("판매량 관리 프로그램");
						System.out.println("--------------------");
						System.out.println("1. 입력   2. 출력   3. 종료");
						continue;
					} if (input.equals("N")){
						sc.nextLine();
						break;
					} 
					
					break;
				case 2 : //출력
					System.out.println("--------------------");
					System.out.println("각 지사별 판매 현황");
					System.out.println("--------------------");
					System.out.println("지사명 제품명 제품가격 판매량 매출현황");
					System.out.println(p.companyName + " " + p.productName + " " + p.productPrice + " " + p.salesCnt + " " + p.total);
					
					
					break;
				case 3 : //종료
					System.out.println("프로그램이 종료되었습니다.");
					break;
				default : System.out.println("잘못된 입력입니다."); break;
			}
			
		}
		
	}

}
