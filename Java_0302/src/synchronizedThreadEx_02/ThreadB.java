package synchronizedThreadEx_02;

public class ThreadB extends Thread{
	
	private WorkObject workObject;
	
	//공유작업 객체를 생성자로 받음
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			workObject.methodB(); //동기화메소드 methodA를 10번 호출
		}
	}
}
