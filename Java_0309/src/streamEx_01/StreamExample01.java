package streamEx_01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample01 {

	public static void main(String[] args) {
		// ��Ʈ��
		
		Set<String> set = new HashSet<String>();
		set.add("ȫ�浿");
		set.add("�ſ��");
		set.add("���ڹ�");
		
/*		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//��Ʈ���� �̿��� ��� �ݺ� ó��
		Stream<String> stream = set.stream(); //��Ʈ�� ���
		stream.forEach(name -> System.out.println(name)); //���ٽ� ���ó��
		

	}

}
