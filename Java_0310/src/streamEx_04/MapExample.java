package streamEx_04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		// ����
		
		int[] intArray = {1,2,3,4,5};
	
		IntStream intStream = Arrays.stream(intArray); //�迭�� ��Ʈ������ ����
		//�⺻ Ÿ�԰��� ��ȯ : int -> double ��ȯ
		intStream.asDoubleStream().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//�⺻ Ÿ�� ��� -> ���� ��ü ��� ��ȯ
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj->System.out.println(obj.intValue()));

	}

}
