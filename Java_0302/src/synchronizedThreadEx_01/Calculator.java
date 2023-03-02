package synchronizedThreadEx_01;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//synchronized를 메소드에 추가 -> 임계 영역 = 전체
	public synchronized void setMemory1(int memory) {
		this.memory = memory; //메모리 값 저장
		
		try {
			Thread.sleep(2000); //2초간 일시정지
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//메모리 값 읽기
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	//setMemory2 -> 임계 영역 = 부분
	public void setMemory2(int memory) {
		
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
	}
	
	
}
