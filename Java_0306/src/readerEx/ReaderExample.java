package readerEx;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		// 문자 읽기
		
		Reader reader = null;
		
		try {
			//문자 입력 스트림 생성
			reader = new FileReader("c:/Temp/test6.txt");
			
			//1문자씩 읽기
			while(true) {
				int data = reader.read(); //1 문자를 읽음
				if(data == -1) break;
				System.out.print((char)data); //읽은 문자 출력
			}
			
			reader.close();
			System.out.println();
			
			
			//문자 배열로 읽기
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
