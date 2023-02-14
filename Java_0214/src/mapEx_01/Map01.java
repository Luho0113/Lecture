package mapEx_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// Map �÷���
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//�߰�
		map.put("���", 2);
		map.put("Ű��", 5);
		map.put("����", 8);
		map.put("����", 4);
		
		
		System.out.println("����� value: " + map.get("���")); //2
		System.out.println("������ value: " + map.get("����")); //8
		
		
		//�ڵΰ� �ִ��� �˻�
		if (map.containsKey("�ڵ�")) {
			System.out.println("�ڵΰ� �ֽ��ϴ�!");
		} else {
			System.out.println("�ڵΰ� �����ϴ�!");
		}
		System.out.println("----------------------");
		
		
		
		//��� Ű�� Set ��ü�� ��Ƽ� ����
		//Set �÷��� ����
		Set<String> fruit = map.keySet();
		Iterator<String> it = fruit.iterator();
		System.out.print("key�� ���: ");
		
		//��ü ���
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//������ 5�� �̻��� ���� ���
		it = fruit.iterator();
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			if(v >= 5) {
				System.out.println("5�� �̻��� ����: " + k);
			}
		}
		
		System.out.println("----------------------");
		//������ 5���� ���� �˻�
		System.out.println("5���� ���� �˻�: " + map.containsValue(5));
		

	}

}
