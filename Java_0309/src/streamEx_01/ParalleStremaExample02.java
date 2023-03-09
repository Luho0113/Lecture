package streamEx_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStremaExample02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("ȫ�浿");
		list.add("���浿");
		list.add("���浿");
		list.add("�ϱ浿");
		
		Stream<String> stream = list.parallelStream();
		stream.forEach( name -> {
			Thread thread = Thread.currentThread();
			System.out.println(name + " : " + thread.getName());
		});

	}

}
