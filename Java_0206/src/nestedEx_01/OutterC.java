package nestedEx_01;

public class OutterC {
	
	int ic = 1;
	static int sic = 2;
	
	void icM() {
		class InnerC {
			int ic2 = 2;
			
			void icM() {
				ic = ic + 1;
				ic2 = ic2 + 2;
				System.out.println("메소드 안에 들어있는 클래스의 메소드 실행");
			}
			
			// static int sic = 2;
			// static void icsM() { }
		}
		
		//메소드 속에서 내부 클래스를 객체화 -> 메소드가 클래스를 독점
		InnerC excM = new InnerC();
		excM.icM();

	} //icM() end
	
	static void sicM() {
		
	}
	

}
