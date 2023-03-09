package collectionStreamEx_02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// �迭�κ��� ��Ʈ�� ���
		
		String[] strArray = { "ȫ�浿", "�ſ��", "��̳�" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ", "));
		//Arrays.stream(strArray).forEach();
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		//�հ� ����ϱ�
		int sum = Arrays.stream(intArray).sum();
		System.out.println(sum);
		
	}

}
