package nestedEx_01;

public class OutterExample {

	public static void main(String[] args) {
		// 1) OtterA(인스턴스 맴버 클래스) 객체화 (내부클래스가 인스턴스)
		OutterA oa = new OutterA(); //외부클래스 객체화
		OutterA.InnerA ia = oa.new InnerA(); //내부클래스 객체화
		
		
		// 2) OtterB(정적 멤버 클래스) 객체화 (내부클래스가 정적)
		OutterB.InnerB oi = new OutterB.InnerB();
		oi.ib = 100;
		oi.inbM();
		OutterB.InnerB.sib = 200;
		//클래스멤버.멤버변수 또는 클래스명.메소드명
		
		
		// 1)방법으로 인스턴스멤버 클래스의 1~100까지 합을 출력하기
		OutterA ea = new OutterA();
		OutterA.ExamA exa = ea.new ExamA();
		exa.examAM(); //계산 메소드 호출
		exa.printSum(); //출력 메소드 호출
		System.out.println("-----------------------");
		
		
		
		// 2)방법으로 정적멤버 클래스의 ***** 출력하기
		OutterB.examB eb = new OutterB.examB(); //객체 생성
		OutterB.examB.examBM(); //객체 생성 안하고 직접 호출 가능?
		System.out.println("-----------------------");
		OutterB.examB.examBM2();
		// eb.examBM2();
		
		
		//인스턴스 메소드 속의 클래스
		OutterC oc = new OutterC();
		oc.icM(); //메소드 호출
		//icM()을 직접 호출하지 못함 -> 밖의 메소드를 호출해야 안의 클래스를 사용할 수 있음
		
		
		//정적 메소드 속의 클래스
		OutterD.sdM();

	}

}
