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
			
			while(true){ //1=무조건 참
				int num = is.read(data); //최대 50byte를 읽고 읽은 바이트는 data 배열에 저장, 읽은 수는 리턴
				if(num == -1) break; //파일 끝에 도달했을 경우
				
				//읽은 바이트를 출력
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
				
			}
			
			is.close(); // 입력 스트림을 닫고 사용 메모리 해제, 배열의 모든 바이트를 출력
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
