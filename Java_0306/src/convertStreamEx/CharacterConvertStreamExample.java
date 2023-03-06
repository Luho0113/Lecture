package convertStreamEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		// UTF-8 문제셋으로 파일에 문자를 저장하고 저장된 문자를 다시 읽음
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream에 OutputStreamWriter 보조 스트림을 연결해서 Writer로 변환
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//Writer writer = new OutputStreamWriter(new FileOutputStream("c:/Temp/test/txt"));
		
		//문자출력
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	
	public static String read() throws Exception {
		//FileInputStream에 InputStreamReader 보조 스트림을 연결해서 Reader로 변환
		InputStream is = new FileInputStream("c:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		//Reader reader = new InputStreamReader(new FileInputStream("c:/Temp/test.txt"));
		
		//문자 입력
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		//char 배열에서 읽은 문자 수만큼 문자열로 변환
		String str = new String(data, 0, num);
		return str;
	}

}
