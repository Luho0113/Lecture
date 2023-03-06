package readerEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//문자 출력
		
		try {
			Writer writer = new FileWriter("c:/Temp/test6.txt");
			
			//1문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("FGH");
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
