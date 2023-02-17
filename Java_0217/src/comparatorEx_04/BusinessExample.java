package comparatorEx_04;

import java.util.Set;
import java.util.TreeMap;

public class BusinessExample {

	public static void main(String[] args) {
		// TreeMap
		TreeMap<Department, Business> saleMap = new TreeMap<Department, Business>(new BusinessComparator());
		

		//��Ʈ�� ����
		saleMap.put( new Department("���Ͽ���", "���ﺻ��"), new Business("���ﺻ��", "��ȭ��", 4460));
		saleMap.put( new Department("��������", "���ﺻ��"), new Business("���ﺻ��", "���θ�", 6800));
		saleMap.put( new Department("��������", "���ﺻ��"), new Business("���ﺻ��", "��ȭ��", 5580));
		saleMap.put( new Department("��������", "���ﺻ��"), new Business("���ﺻ��", "���θ�", 3560));
		
		
		//��ü ���
		Set<Department> keySet = saleMap.keySet();
		
		for(Department d : keySet) {
			System.out.println(d.getDepartmentName() + " - " + d.getCentral() + " / " + saleMap.get(d).getStoreLocation() + " / " +  saleMap.get(d).getSales());
		}
		
		//���Ͽ����� �Է��ϸ� ������ġ�� �Ҽ��� ���
		
		
		//��� �������� �ǸŽ����� �հ�
		
		
		//�ǸŽ����� ���� ���� ������ ���

	}

}
