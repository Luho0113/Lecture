package polymoEx_01;

import java.util.Scanner;

public class ScoreMain {
	static Scanner sc; //전역변수 (모든 메소드가 사용가능하도록 설정하는 것 != 지역변수)
	static int menu;
	static ScoreBusiness sb; //비즈니스 클래스의 주소
	
	public static void main(String[] args) {
		// 비즈니스 클래스 호출하기, 시작 메뉴 화면 만들기, 비즈니스 클래스 호출하기
		
		//다형성 사용
		Score e1 = new Elementary();
		Score m1 = new Middle();
		Score h1 = new High();
		
		//비즈니스 클래스 객체 생성
		sb = new ScoreBusiness();
				
		
		sc = new Scanner(System.in);
		boolean end = false;
		//시작 메뉴 화면 + 메뉴 선택
		do {
			
			menu = 0;
			end = false;
			
			System.out.println("-----------------------------------");
			System.out.println("1. 초등학교 2. 중학교 3. 고등학교 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("메뉴 선택 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			
				case 1 :
					elementary(e1); //객체의 주소(e1)를 해당 메소드로 보냄
					break;
					
				case 2 :
					middle(m1); 
					break;
					
				case 3 :
					high(h1); 
					break;
					
				case 4 :
					end = true;
					System.out.println("종료됐습니다."); 
					break;
					
				default : 
					System.out.println("잘못된 입력입니다."); 
					break;
					
			}
			
		}while(!end);

	} //main() 종료
	
	
	//메뉴 입력
	private static void high(Score h1) { //타입 변수명
		boolean end = false;
		do {
			System.out.println("-----------------------------------");
			System.out.println("고등학교 성적관리 프로그램");
			System.out.println("-----------------------------------");
			System.out.println("1.입력 2. 출력 3. 메인으로 돌아가기");
			System.out.print("선택 > ");
			
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
			System.out.println("중학교 성적관리 프로그램");
			System.out.println("-----------------------------------");
			System.out.println("1.입력 2. 출력 3. 메인으로 돌아가기");
			System.out.print("선택 > ");
			
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
			System.out.println("초등학교 성적관리 프로그램");
			System.out.println("-----------------------------------");
			System.out.println("1.입력 2. 출력 3. 메인으로 돌아가기");
			System.out.print("선택 > ");
			
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
