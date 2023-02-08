package insufficienEx_02;

import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
		Score score = new Score();
		
		
		
		try {
			
			boolean flag = true;
			
			while(flag) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("토익 점수를 입력하세요. > ");
				score.setFinalScore(sc.nextInt());
				score.inputScore(score.getFinalScore());
				
				
				System.out.print("계속 하시겠습니까? (Y/N) > ");
				String choice = sc.next();
				choice = choice.toUpperCase();
				sc.nextLine();
				if (choice.equals("N")) {
					flag = false;
				} else if (choice.equals("Y")) {
					flag = true;
				} else {
					System.out.println("잘못입력했습니다./n다시 입력해주세요.");
					flag = true;
				}
			}
			
		}catch (ScoreMinException e) {
			String message = e.getMessage();
			System.out.println(message);
			
		}catch (ScoreMaxException e) {
			String message = e.getMessage();
			System.out.println(message);
		}finally {
			System.out.println("프로그램 종료!");
		}
		

	}

}
