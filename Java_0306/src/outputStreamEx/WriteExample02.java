package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) {
		// 바이트 배열 출력
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
			
			byte[] array = {10,20,30};
			
			os.write(array); //배열의 모든 바이트를 출력
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
