package streamEx_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectExample {

	public static void main(String[] args) {
		// ��� �׷���
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("��μ�", "��", 92));
		totalList.add(new Student("�����", "��", 87));
		totalList.add(new Student("������", "��", 95));
		totalList.add(new Student("��ö��", "��", 93));
		
		Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(s -> s.getGender()));
		
		List<Student> femaleList = map.get("��");
		femaleList.stream().forEach(s->System.out.println("�� : " + s.getName()));
		
		List<Student> maleList = map.get("��");
		maleList.stream().forEach(s->System.out.println("�� : " + s.getName()));
		
		//������ �׷����ϰ� ������ ��������� ���ؼ� MAp���� ��� �ڵ�
		Map<String, Double> map2 = totalList.stream()
		.collect(Collectors.groupingBy
				(s -> s.getGender(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println(map2);
		
		
	}

}
