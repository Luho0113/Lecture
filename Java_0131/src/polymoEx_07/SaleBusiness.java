package polymoEx_07;

import java.util.Scanner;

public class SaleBusiness {
	
	//변수에 객체들의 주소가 담겨져있음 > 다른 메소드에서 주소를 가져다가 쓸 수 있게 함
	Scanner sc;
	
	Company seoul;
	Company gyeongin;
	Company gangwon;
	Company jeju;
	
	//기본 생성자
	public SaleBusiness() {
		sc = new Scanner(System.in);
		
		//Comany 객체 생성
		seoul = new Seoul();
		gyeongin = new Gyeongin();
		gangwon = new Gangwon();
		jeju = new Jeju();
	}
	
	
	
	//저장을 위한 배열 생성
	Product[] item = new Product[10];

	String input = null; //선택 계속 여부
	

	//1번 입력 담당 메소드
	public void input() {
		String choice = "n";
		
		do {
			System.out.println("--------------------------");
			System.out.println("입력하실 지사를 선택해주십시오.");
			System.out.println("1. 서울지사 2. 경인지사 3. 강원지사 4. 제주지사");
			System.out.println("--------------------------");
			System.out.print("지사 선택 > ");
			
			int companySelect = 0;
			companySelect = sc.nextInt();
			switch(companySelect) {
				case 1: companyInput(seoul); break;
				case 2: companyInput(gyeongin); break;
				case 3: companyInput(gangwon); break;
				case 4: companyInput(jeju); break;
			}

			
			System.out.print("계속 입력하시겠습니까? (Y/N)");
			choice = sc.nextLine().toUpperCase();
		} while(choice.equals("Y"));
		
		
	}
	
	//지사 선택 후 제품과 제품량 입력 메소드
	private void companyInput(Company company) { //매개변수: 자식의 주소를 부모 타입으로 받아옴
		System.out.print("제품 입력 > ");
		
		if (company instanceof Seoul) {
			//다운캐스팅
			seoul = (Seoul) company;
			
			company.setProductName(sc.next()); //제품 이름 입력
			sc.nextLine();
			System.out.print(seoul + " " + seoul.getProductName() + "판매량 입력 > " );
			company.setSaleAmount(sc.nextInt()); // 판매량 입력
			sc.nextLine();
			
			
			System.out.println(">> 입력 결과: " + seoul + "지사/ " + seoul.getProductName() + " / 판매량" +  seoul.getSaleAmount());
			
			//메소드 호출 - 제품과 판매량 값을 받아와서 매출현황에 넣어줌
			seoul.setSaleStatus( saleStatusMethod( seoul.getProductName(), seoul.getSaleAmount() ) );
			//메소드 호출 - 제품 가격을 받아와서 매출 현황에 넣어줌
			seoul.setProductPrice( priceInput( seoul.getProductName() ) );
		}
		
		
		if (company instanceof Gangwon) {
			gangwon = (Gangwon) company;
			
			company.setProductName(sc.next());
			sc.nextLine();
			System.out.print(gangwon + " " + gangwon.getProductName() + "판매량 입력 > " );
			company.setSaleAmount(sc.nextInt());
			sc.nextLine();
			System.out.println(">> 입력 결과: " + gangwon + "지사 / " + gangwon.getProductName() + " / 판매량 " +  gangwon.getSaleAmount());
			
			gangwon.setSaleStatus( saleStatusMethod( gangwon.getProductName(), gangwon.getSaleAmount() ) );
			gangwon.setProductPrice( priceInput( gangwon.getProductName() ) );
		}
		
		if (company instanceof Gyeongin) {
			gyeongin = (Gyeongin) company;
			
			company.setProductName(sc.next());
			sc.nextLine();
			System.out.print(gyeongin + " " + gyeongin.getProductName() + "판매량 입력 > " );
			company.setSaleAmount(sc.nextInt());
			sc.nextLine();
			System.out.println(">> 입력 결과: " + gyeongin + "지사/ " + gyeongin.getProductName() + " / 판매량" +  gyeongin.getSaleAmount());
		
			gyeongin.setSaleStatus( saleStatusMethod( gyeongin.getProductName(), gyeongin.getSaleAmount() ) );
			gyeongin.setProductPrice( priceInput( gyeongin.getProductName() ) );
		}
		
		if (company instanceof Jeju) {
			jeju = (Jeju) company;
			
			company.setProductName(sc.next()); 
			sc.nextLine();
			System.out.print(jeju + " " + jeju.getProductName() + "판매량 입력 > " );
			company.setSaleAmount(sc.nextInt()); 
			sc.nextLine();
			System.out.println(">> 입력 결과 " + jeju + "지사/ " + jeju.getProductName() + " / 판매량" +  gyeongin.getSaleAmount());
		
			jeju.setSaleStatus( saleStatusMethod( jeju.getProductName(), jeju.getSaleAmount() ) );
			jeju.setProductPrice( priceInput( jeju.getProductName() ) );
		}

	}

	
	
	//2번 출력 담당 메소드
	public void ouput() {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		System.out.println("각 지사별 판매 현황");
		System.out.println("--------------------");
		System.out.printf("%12s %10s %10s %10s %10s\n", "지사명", "제품명", "제품가격", "판매량", "매출현황");
		
		System.out.printf
		("%12s %10s %10s %10s %10s\n", seoul, seoul.getProductName(), seoul.getProductPrice(), seoul.getSaleAmount(), seoul.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", gangwon, gangwon.getProductName(), gangwon.getProductPrice(), gangwon.getSaleAmount(), gangwon.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", gyeongin, gyeongin.getProductName(), gyeongin.getProductPrice(), gyeongin.getSaleAmount(), gyeongin.getSaleStatus());
		System.out.printf
		("%12s %10s %10s %10s %10s\n", jeju, jeju.getProductName(), jeju.getProductPrice(), jeju.getSaleAmount(), jeju.getSaleStatus());
		

	
	
	}
	
	
	
	//3번 매출현황 계산 메소드 (제품명과 판매량을 받아와서 total값을 계산해서 리턴함)
	private int saleStatusMethod(String productName, int saleAmount) {
		int total = 0; //매출현황
		
		if(productName.equals("컴퓨터")) {
			total = 2000000 * saleAmount;
		} else if (productName.equals("프린터")) {
			total = 500000 * saleAmount;
		} else {
			System.out.println("제품을 잘못 입력했습니다.");
		}
		
		return total;
	}
	
	//제품가격 메소드 (제품명을 받아와서 제품가격을 리턴)
	private int priceInput(String productName) {
		if(productName.equals("컴퓨터")) return 2000000;
		else if (productName.equals("프린터")) return 500000;
		
		return 0;
	}
	

}
