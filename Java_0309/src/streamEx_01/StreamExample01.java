package streamEx_01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample01 {

	public static void main(String[] args) {
		// 스트림
		
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
/*		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//스트림을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); //스트림 얻기
		stream.forEach(name -> System.out.println(name)); //람다식 요소처리
		

	}

}
