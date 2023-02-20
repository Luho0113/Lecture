package immutableEx_01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> immutableList = List.of("A", "B", "C");
		// 변경안되는 리스트 만들기
		// immutableList.add("D"); -> 실행하면 오류 발생, 새로 추가할 수 없음
		// immutableList.remove("A"); -> 실행하면 오류 발생, 삭제할 수 없음
		
		Set<String> immutableSet = Set.of("1", "2", "3");
		// immutableSet.add("4"); -> 실행하면 오류 발생
		
		Map<Integer, String> immutableMap = Map.of(1, "A", 2, "B", 3, "C");
		// immutableMap.put(4, "D"); -> 실행하면 오류 발생
		
		//키만 구하기
		Set<Integer> keys = immutableMap.keySet();
		// Iterator<Integer> k = keys.iterator();
		
		
		//Map 생성
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("홍길동", 100);
		studentMap.put("이순신", 70);
		studentMap.put("유관순", 80);
		
		// studentMap.remove("이순신"); -> 오류가 발생하지 않음
		
		//copyOf 사용 -> 변경되지 않도록 함
		Map<String, Integer> imMap = Map.copyOf(studentMap);
		// imMap.remove("이순신"); -> 실행하면 오류 발생
		// studentMap.remove("이순신"); -> 삭제되지 않음
		
		//전체 출력
		Set<Entry<String, Integer>> entrySet = imMap.entrySet();
		for(Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() +" : "+ e.getValue());
		}
	}

}
