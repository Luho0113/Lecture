package polymoEx_05;

public class PolyTvMain {

	public static void main(String[] args) {
		// 메인
		
		//자신 스스로 객체 생성 - 부모와 자신의 필드를 다 사용할 수 있음
		CaptionTv ca = new CaptionTv();
		ca.channel = 11;
		ca.power = true;
		ca.text = "파노라마";
		
		//Tv 객체 생성 - 자식 클래스의 필드 사용 불가능
		Tv Tv = new Tv();
		Tv.channel = 7;
		Tv.power = false;
		Tv.channelDown();
		Tv.channelUp();
		
		//다형성을 사용해 객체화하기
		Tv myTv = new CaptionTv(); //부모클래스 변수 = new 자식클래스();
		myTv.channel = 8;
		myTv.power = false;
		System.out.println("=================");
		myTv.channelUp(); //부모를 override한 메소드 = 자식 메소드를 호출
		
		//1. 부모 클래스에 같은 메소드를 올려서 자식 메소드에서 오버라이딩
		// myTv.text = "자식 필드"; 부모 클래스에 .text()가 없다면 사용 불가능!
		// myTv.caption(); 자식 필드의 메소드 사용 불가능!
		
		
		//2. 다운캐스팅으로 불러내기
		CaptionTv ct1 = (CaptionTv) myTv; //다운캐스팅
		ct1.text = "자식 필드 사용 가능!";//자식 필드와 메소드를 사용
		ct1.caption(); 
		

	}

}
