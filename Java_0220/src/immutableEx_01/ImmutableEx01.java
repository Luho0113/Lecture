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
		// ����ȵǴ� ����Ʈ �����
		// immutableList.add("D"); -> �����ϸ� ���� �߻�, ���� �߰��� �� ����
		// immutableList.remove("A"); -> �����ϸ� ���� �߻�, ������ �� ����
		
		Set<String> immutableSet = Set.of("1", "2", "3");
		// immutableSet.add("4"); -> �����ϸ� ���� �߻�
		
		Map<Integer, String> immutableMap = Map.of(1, "A", 2, "B", 3, "C");
		// immutableMap.put(4, "D"); -> �����ϸ� ���� �߻�
		
		//Ű�� ���ϱ�
		Set<Integer> keys = immutableMap.keySet();
		// Iterator<Integer> k = keys.iterator();
		
		
		//Map ����
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("ȫ�浿", 100);
		studentMap.put("�̼���", 70);
		studentMap.put("������", 80);
		
		// studentMap.remove("�̼���"); -> ������ �߻����� ����
		
		//copyOf ��� -> ������� �ʵ��� ��
		Map<String, Integer> imMap = Map.copyOf(studentMap);
		// imMap.remove("�̼���"); -> �����ϸ� ���� �߻�
		// studentMap.remove("�̼���"); -> �������� ����
		
		//��ü ���
		Set<Entry<String, Integer>> entrySet = imMap.entrySet();
		for(Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() +" : "+ e.getValue());
		}
	}

}
