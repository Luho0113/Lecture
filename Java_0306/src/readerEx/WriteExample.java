package readerEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//���� ���
		
		try {
			Writer writer = new FileWriter("c:/Temp/test6.txt");
			
			//1���ھ� ���
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char �迭 ���
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//���ڿ� ���
			writer.write("FGH");
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
