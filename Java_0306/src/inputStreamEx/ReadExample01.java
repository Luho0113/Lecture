package inputStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample01 {

	public static void main(String[] args) {
		// 입력 스트림 : 바이트 읽기
		
		try {
			InputStream is = new FileInputStream("c:/Temp/test1.txt");
			
			while(true){ //1=무조건 참
				int data = is.read(); //1byte씩 읽기
				if(data == -1) break; //파일 끝에 도달했을 경우
				//아예 종료하고 싶을 때 : System.exit(0);
				System.out.println(data);
			}
			
			is.close(); // 입력 스트림을 닫고 사용 메모리 해제
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
