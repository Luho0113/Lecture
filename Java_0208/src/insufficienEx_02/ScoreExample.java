package insufficienEx_02;

import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
		Score score = new Score();
		
		
		
		try {
			
			boolean flag = true;
			
			while(flag) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���� ������ �Է��ϼ���. > ");
				score.setFinalScore(sc.nextInt());
				score.inputScore(score.getFinalScore());
				
				
				System.out.print("��� �Ͻðڽ��ϱ�? (Y/N) > ");
				String choice = sc.next();
				choice = choice.toUpperCase();
				sc.nextLine();
				if (choice.equals("N")) {
					flag = false;
				} else if (choice.equals("Y")) {
					flag = true;
				} else {
					System.out.println("�߸��Է��߽��ϴ�./n�ٽ� �Է����ּ���.");
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
			System.out.println("���α׷� ����!");
		}
		

	}

}
