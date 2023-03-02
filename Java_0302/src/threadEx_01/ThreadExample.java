package threadEx_01;

public class ThreadExample {

	public static void main(String[] args) {
		// 스레드 이름
		
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();
		System.out.println(threadName);
		
		PhoneThread phoneTask = new PhoneThread();
		Thread phoneThread = new Thread(phoneTask);
		phoneThread.start();
		
		YoutubeThread youtubeThread = new YoutubeThread();
		youtubeThread.start();
		
		//Phone 스레드의 이름 출력
		phoneThread.currentThread().setName("전화걸기");
		System.out.println("Phone 스레드 이름 : " + phoneThread.currentThread().getName());
		
		youtubeThread.currentThread().setName("유튜브 보기");
		System.out.println("Youtube 스레드 이름 : " + youtubeThread.currentThread().getName());
		System.out.println();
		
		//우선순위 출력
		//1: 우선순위 높음 ~ 10:우선순위 낮음
		System.out.println("우선순위 : " + phoneThread.currentThread().getPriority());
		phoneThread.currentThread().setPriority(1); //우선순위 설정
		System.out.println("바꾼 우선순위 1) : " + phoneThread.currentThread().getPriority());
		youtubeThread.currentThread().setPriority(10);
		System.out.println("바꾼 우선순위 2) : " + youtubeThread.currentThread().getPriority());
		
	}

}
