package threadEx_01;

public class PhoneThread implements Runnable{
	//Runnable의 구현클래스
	
	@Override
	public void run() {
		System.out.println("전화 걸기");
		
	}

}
