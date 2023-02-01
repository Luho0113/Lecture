package polymoEx_05;

public class Tv {
	//부모 클래스
	boolean power; //전원필드
	int channel; //채널
	
	//전원공급 메소드
	void power() {
		power = !power;
	}
	
	//채널을 키는 메소드
	void channelUp() {
		++channel;
	}
	
	//채널을 끄는 메소드
	void channelDown() {
		--channel;
	}

}
