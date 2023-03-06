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
		// UTF-8 ���������� ���Ͽ� ���ڸ� �����ϰ� ����� ���ڸ� �ٽ� ����
		
		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� �����ؼ� Writer�� ��ȯ
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//Writer writer = new OutputStreamWriter(new FileOutputStream("c:/Temp/test/txt"));
		
		//�������
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	
	public static String read() throws Exception {
		//FileInputStream�� InputStreamReader ���� ��Ʈ���� �����ؼ� Reader�� ��ȯ
		InputStream is = new FileInputStream("c:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		//Reader reader = new InputStreamReader(new FileInputStream("c:/Temp/test.txt"));
		
		//���� �Է�
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		//char �迭���� ���� ���� ����ŭ ���ڿ��� ��ȯ
		String str = new String(data, 0, num);
		return str;
	}

}
