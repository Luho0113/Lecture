package inputStreamEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample02 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/Temp/test2.txt");
			byte[] data = new byte[50];
			
			while(true){ //1=������ ��
				int num = is.read(data); //�ִ� 50byte�� �а� ���� ����Ʈ�� data �迭�� ����, ���� ���� ����
				if(num == -1) break; //���� ���� �������� ���
				
				//���� ����Ʈ�� ���
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
				
			}
			
			is.close(); // �Է� ��Ʈ���� �ݰ� ��� �޸� ����, �迭�� ��� ����Ʈ�� ���
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
