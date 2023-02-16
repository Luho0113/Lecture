package treeMapEx_02;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class BasicSalary2 {

	public static void main(String[] args) {
		// TreeMap
		
		//<�μ���, �̸�>
		TreeMap<String, String> salary = new TreeMap<>();
		
		//��Ʈ�� ����
		salary.put("������", "����ȣ");
		salary.put("ȫ����", "�谭��");
		salary.put("��ȹ��", "�迵��");
		
		//��Ʈ�� ����ϱ�
		System.out.println("��ü ��� ��� > ");
		Set<Entry<String, String>> salarySet = salary.entrySet();
		for(Entry<String, String> e : salarySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		
		//�������� ���
		System.out.println("�������� ��� > ");
		NavigableMap<String, String> decendingSalary = salary.descendingMap();
		Set<Entry<String, String>> decendingSalarySet = decendingSalary.entrySet();
		for(Entry<String, String> e : decendingSalarySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		

	}

}
