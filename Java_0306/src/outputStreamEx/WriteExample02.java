package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample02 {

	public static void main(String[] args) {
		// ����Ʈ �迭 ���
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
			
			byte[] array = {10,20,30};
			
			os.write(array); //�迭�� ��� ����Ʈ�� ���
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
