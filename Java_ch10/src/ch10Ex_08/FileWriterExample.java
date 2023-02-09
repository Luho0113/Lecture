package ch10Ex_08;

public class FileWriterExample {

	public static void main(String[] args) {
		//리소스 자동 닫기로 수정
/*		FileWriter fw = null;
		try {
			fw = new FileWriter("file.txt"); //파일을 만드는 것
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
			}
		} */
		
		//구현 클래스의 객체를 생성
		try( FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
			//IOException 발생
		} catch (Exception e ) {
			e.printStackTrace();
		}

	}

}
