package streamEx_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		// ��� �����ϱ�
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("��μ�", "��", 92));
		totalList.add(new Student("�����", "��", 87));
		totalList.add(new Student("������", "��", 95));
		totalList.add(new Student("��ö��", "��", 93));
		
		List<Student> femaleList = totalList.stream()
		.filter(s -> s.getGender().equals("��"))
		.collect(Collectors.toList());
		
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		//�л��̸�=Ű, Student��ü=���� ������ Map ����
		Map<String, Integer> map = totalList.stream()
		.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println(map);

	}

}
