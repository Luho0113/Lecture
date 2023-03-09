package collectionStreamEx_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// �÷������κ��� ��Ʈ�� ���
		
		//List �÷��� ����
		List<Product> list = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			Product product = new Product(i, "��ǰ" + i, "����ȸ�� ", (int)(10000*Math.random()));
			list.add(product);
		}
		
		//��ü��Ʈ�� ���
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));

	}

}
