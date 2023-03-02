package threadEx_01;

public class YoutubeThread extends Thread{
	//Thread 클래스를 상속
	
	@Override
	public void run() {
		System.out.println("유튜브 보기");
	}

}
