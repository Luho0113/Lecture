package nestedEx_01;

public class OutterA {
	//변수 선언
	int oa = 10;
	static int soa = 20; //정적 필드, 클래스 멤버(변수)
	
	//메소드 선언
	void oaM() {
		oa = oa + 1 ;
		soa = soa + 2;
		soaM();
	}
	static void soaM() {
		//인스턴스 변수(oa) 사용불가능
		soa = soa + 2;
	}
	
	//중첩 클래스
	class InnerA {
		int ia = 3;
		// static int sia = 30;
		void inaM () {
			ia = ia + 3;
			oa = oa + 1;
			soa = soa + 2; 
			oaM();
			soaM();
		}
		// static void siaM() { }
		
	}
	
	//예제1
	class ExamA{
		int sum = 0;
		int i = 0;
		void examAM() {
			for (i = 0; i<=100; i++) {
				sum = sum + i;
			}
		}
		void printSum() {
			System.out.println("1~100까지의 합: " + sum);
		}
		
	}

}
