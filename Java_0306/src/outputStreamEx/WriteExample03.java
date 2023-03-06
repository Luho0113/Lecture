package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) {
		// 바이트 배열 출력

		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.txt");

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array, 1, 3); // 1번 인덱스부터 3개까지만 출력, 20 30 40

			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
