package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample01 {

	public static void main(String[] args) {
		// ����Ʈ ���
		
		try {
			//����Ʈ ��� ��Ʈ�� ����
			OutputStream os = new FileOutputStream("c:/Temp/test1.txt");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//1����Ʈ�� ���
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); //���� ������ �ܷ� ����Ʈ�� ����ϰ� ���۸� ���
			os.close(); // ��� ��Ʈ���� �ݾ� ����� �޸𸮸� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
