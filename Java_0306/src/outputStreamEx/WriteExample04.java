package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample04 {

	public static void main(String[] args) {
		//문자 바이트 배열
		
		try {
			OutputStream os = new FileOutputStream("c:/Temp/test4.text");
			
			byte[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
			
			os.write(array);
			os.flush();
			os.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
