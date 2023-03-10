package streamEx_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {
		//��Ҹ� ���� ���� ��ҷ� ��ȯ
		
		//���� ��Ʈ�� -> �ܾ� ��Ʈ��
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i an a best developer");
		
		list1.stream()
		.flatMap(data -> Arrays.stream(data.split(" "))) 
		 //this/is/java�� ����
		 //�־��� String�迭�� Stream<String>���� ����
		.forEach(word->System.out.println(word));
		
		System.out.println();
		
		//���ڿ� ���� ��� ��Ʈ�� -> ���� ��Ʈ��
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		
		list2.stream()
		.flatMapToInt(data->{
			//Stirng[] �迭�� int[] �迭�� ��ȯ
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr); 
			//Arrays.stream() -> �־��� int�迭�� intStream���� ����
		})
		.forEach(number->System.out.println(number));
	}

}
