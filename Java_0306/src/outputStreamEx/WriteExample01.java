package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample01 {

	public static void main(String[] args) {
		// 바이트 출력
		
		try {
			//바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("c:/Temp/test1.txt");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//1바이트씩 출력
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); //내부 버퍼의 잔류 바이트를 출력하고 버퍼를 비움
			os.close(); // 출력 스트림을 닫아 사용한 메모리를 해제
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
