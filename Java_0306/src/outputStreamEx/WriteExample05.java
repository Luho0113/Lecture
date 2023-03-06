package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample05 {

	public static void main(String[] args) {
		//바이트 배열
		
		try {
			OutputStream os = new FileOutputStream("c:/Temp/test5.text");
			
			byte[] array = {1, 2, 3, 4, 5};
			
			os.write(array, 1, 3); //2, 3, 4
			os.flush();
			os.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
