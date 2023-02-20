package ch15Ex_09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// �������, �ְ�����, �ְ������� ���� ���̵� ���
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0; //�ְ� ���� ����
		int totalScore = 0; //���� �հ� ����
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> e : entrySet) {
			if(e.getValue() > maxScore) {
				name = e.getKey();
				maxScore = e.getValue();
			}
			totalScore = totalScore + e.getValue();
		}
		
		int avgScore = totalScore/map.size();
		System.out.println("��� ����: " + avgScore);
		
		System.out.println("�ְ� ����: " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵�: " + name);
		

	}

}
