package streamEx_01;

import java.util.stream.IntStream;

public class FilteringExample02 {

	public static void main(String[] args) {
		// ���� ������ ��Ʈ�� ��� (�������� ��Ʈ��)
		// 1~100���̿��� ¦���� ����ϱ�
		IntStream.rangeClosed(1, 100).filter(number -> number%2==0).forEach(number->System.out.println(number));

	}

}
