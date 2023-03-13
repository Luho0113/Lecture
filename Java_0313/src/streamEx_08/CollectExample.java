package streamEx_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectExample {

	public static void main(String[] args) {
		// 요소 그룹핑
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("김민수", "남", 92));
		totalList.add(new Student("김민지", "여", 87));
		totalList.add(new Student("오수빈", "여", 95));
		totalList.add(new Student("박철수", "남", 93));
		
		Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(s -> s.getGender()));
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s->System.out.println("여 : " + s.getName()));
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s->System.out.println("남 : " + s.getName()));
		
		//성별로 그룹핑하고 각각의 평균점수를 구해서 MAp으로 얻는 코드
		Map<String, Double> map2 = totalList.stream()
		.collect(Collectors.groupingBy
				(s -> s.getGender(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map2);
		
		
	}

}
