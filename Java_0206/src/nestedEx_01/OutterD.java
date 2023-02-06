package nestedEx_01;

public class OutterD {
	
	static int sid = 1;
	
	static void sdM() {
		final int ss = 10;
		
		class InnerD {
			int sid2 = 2;
			void siM() {
				System.out.println("메소드 속의 InnerD클래스의 siM():" + sid2 + " /  " + sid);
			}
		}
		
		// 클래스 객체화
		InnerD id = new InnerD();
		id.siM();
	}

}
