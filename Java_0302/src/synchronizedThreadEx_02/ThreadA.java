package synchronizedThreadEx_02;

public class ThreadA extends Thread{
//WorkObject의 methodA를 실행하는 스레드
	
	private WorkObject workObject;
	
	//공유작업 객체를 생성자로 받음
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodA(); //동기화메소드 methodA를 10번 호출
		}
	}
}
