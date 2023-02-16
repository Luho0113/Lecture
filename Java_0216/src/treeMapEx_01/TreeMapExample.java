package treeMapEx_01;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// �÷��� ����
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//��Ʈ�� ����
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		
		//���ĵ� ��Ʈ�� �ϳ��� ��������
		System.out.println("���ĵ� ��Ʈ�� ��� 1) > ");
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		
		System.out.println("���ĵ� ��Ʈ�� ��� 2) > ");
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Entry<String, Integer> i = entryIt.next();
			System.out.println(i.getKey() + " - " + i.getValue());
			// System.out.println(entryIt.next());
		}
		System.out.println();
		
		
		//Ư�� Ű�� ���� �� ��������
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry(); //apple-10
		System.out.println("���� �� �ܾ�: " + entry.getKey() + " - " + entry.getValue());
		
		entry = treeMap.lastEntry(); //zoo-80
		System.out.println("���� �� �ܾ�: " + entry.getKey() + " - " + entry.getValue());
		
		//ever �ܾ��� �� �ܾ� (descroption-40)
		entry = treeMap.lowerEntry("ever"); 
		System.out.println("ever�� �� �ܾ�: " + entry.getKey() + " - " + entry.getValue());
		entry = treeMap.higherEntry("ever");
		System.out.println("ever�� �� �ܾ�: " + entry.getKey() + " - " + entry.getValue());
		System.out.println();
		
		//�������� ����
		System.out.println("�������� ���� >");
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		
		//���� �˻�
		System.out.println("c~h ������ �ܾ� �˻� > ");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		
		System.out.println("key ���� Set�� ���� > ");
		NavigableSet<String> keySet = treeMap.descendingKeySet();
		for(String n : keySet) {
			System.out.println( n + " - " + treeMap.get(n));
		}

	}

}
