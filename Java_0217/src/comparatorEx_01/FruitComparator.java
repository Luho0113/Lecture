package comparatorEx_01;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//o1 = tree�� �ޱ����� �ּ�, o2=tree�� �޷��ִ� �ڷ��� �ּ�

		/*//���ڷ� ���ϱ�
		 * System.out.println("o1: " + o1.price); System.out.println("o2: " + o2.price);
		 * System.out.println("o1:o2 : " + o1.price.compareTo(o2.price) );
		 * System.out.println("------------"); return o1.price.compareTo(o2.price);
		 */

		/*//���� int�� ���ϱ�
		 * if(o1.price < o2.price) return -1; 
		 * else if(o1.price == o2.price) return 0;
		 * else return 1;
		 */

		// �̸����� ���ϱ�
		return o1.name.compareTo(o2.name);
	}

}
