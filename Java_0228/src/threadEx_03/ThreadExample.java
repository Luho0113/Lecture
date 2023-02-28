package threadEx_03;

public class ThreadExample {

	public static void main(String[] args) {
		//익명 클래스로 만들기
		//인터페이스를 익명으로 구현 (익명형 구현클래스)
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("카톡하기");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start(); 
		
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("유튜브 보기");
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.start(); 
		
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("게임하기");
				
			}
		});
		t3.start();

	}

}
