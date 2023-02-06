package nestedEx_01;

public class OutterB {
	//변수 선언
	int ob = 10;
	static int sob = 20; //정적 필드, 클래스 멤버(변수)
	
	//메소드 선언
	void oaM() {
		ob = ob + 1 ;
		sob = sob + 2;
		soaM();
	}
	static void soaM() {
		//인스턴스 변수(oa) 사용불가능
		sob = sob + 2;
	}
	
	//중첩 클래스
	static class InnerB { //컴파일 단계에서 미리 메모리에 올라감 -> 바깥 클래스의 인스턴스 멤버 사용X
		
		int ib = 3;
		static int sib = 30;
		void inbM () {
			ib = ib + 3;
			// ob = ob + 1;
			sob = sob + 2; 
			// obM();
			soaM();
		}
		
		static void sibM() { 
			
		}
		
	}
	
	//예제2
	static class examB {

		static void examBM() {
			for (int i = 0; i < 5; i++) {
				for (int j = 0;j < 5-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		static void examBM2 () {
			for (int i = 0; i < 4; i++ ) { //i=0,1,2,3
				for (int j = 0; j < i+1; j++) { //j=0
					// 별 = 2 > 4 > 6 > 7
					System.out.print("*");
				}
				for (int k = 0; k < 5 -(2*i); k++) { //k=0,1,2,3,4
					//공백 = 5 > 3 > 1 > f
					System.out.print(" ");
				}
				for (int l = 0; l < i+1; l++) { //l=0,1,2
					if (i==3 && l==3) break;
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
