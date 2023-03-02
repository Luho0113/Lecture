package synchronizedThreadEx_02;

public class WorkObject {
//두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
	
	//동기화 메소드 A
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); //다른 스레드를 실행 대기 상태로 바꿈
		
		try {
			wait(); //자신의 스레드는 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//동기화 메소드 B
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); // 실행 대기 상태

		try {
			wait(); // 일시 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
