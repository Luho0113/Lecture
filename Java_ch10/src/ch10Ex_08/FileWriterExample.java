package ch10Ex_08;

public class FileWriterExample {

	public static void main(String[] args) {
		//���ҽ� �ڵ� �ݱ�� ����
/*		FileWriter fw = null;
		try {
			fw = new FileWriter("file.txt"); //������ ����� ��
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
			}
		} */
		
		//���� Ŭ������ ��ü�� ����
		try( FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
			//IOException �߻�
		} catch (Exception e ) {
			e.printStackTrace();
		}

	}

}
