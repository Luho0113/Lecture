package inputStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample01 {

	public static void main(String[] args) {
		// �Է� ��Ʈ�� : ����Ʈ �б�
		
		try {
			InputStream is = new FileInputStream("c:/Temp/test1.txt");
			
			while(true){ //1=������ ��
				int data = is.read(); //1byte�� �б�
				if(data == -1) break; //���� ���� �������� ���
				//�ƿ� �����ϰ� ���� �� : System.exit(0);
				System.out.println(data);
			}
			
			is.close(); // �Է� ��Ʈ���� �ݰ� ��� �޸� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
