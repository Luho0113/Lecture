package ch09Ex_05;

public class ActionExample {

	public static void main(String[] args) {
		// Action의 익명 구현 객체를 만들어 실행하기
		
		//필드에 익명 구현 객체 대입
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
		};
		
		action.work();
		


	}

}
