package outputStreamEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) {
		// ����Ʈ �迭 ���

		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.txt");

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array, 1, 3); // 1�� �ε������� 3�������� ���, 20 30 40

			os.flush();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
