package synchronizedThreadEx_02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		//공유 작업 객체 생성
		WorkObject workObject = new WorkObject();
		
		//스레드 생성
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		//스레드 실행
		threadA.start();
		threadB.start();
		
		
		//주 스레드로 설정
		threadA.setDaemon(false);
		//데몬 스레드로 설정
		threadB.setDaemon(true);

	}

}
