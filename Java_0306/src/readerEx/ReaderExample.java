package readerEx;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		// ���� �б�
		
		Reader reader = null;
		
		try {
			//���� �Է� ��Ʈ�� ����
			reader = new FileReader("c:/Temp/test6.txt");
			
			//1���ھ� �б�
			while(true) {
				int data = reader.read(); //1 ���ڸ� ����
				if(data == -1) break;
				System.out.print((char)data); //���� ���� ���
			}
			
			reader.close();
			System.out.println();
			
			
			//���� �迭�� �б�
			reader = new FileReader("c:/Temp/test6.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
				
			}
			reader.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
