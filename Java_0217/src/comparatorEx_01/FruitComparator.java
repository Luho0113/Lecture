package comparatorEx_01;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//o1 = tree에 달기위한 주소, o2=tree에 달려있는 자료의 주소

		/*//비교자로 비교하기
		 * System.out.println("o1: " + o1.price); System.out.println("o2: " + o2.price);
		 * System.out.println("o1:o2 : " + o1.price.compareTo(o2.price) );
		 * System.out.println("------------"); return o1.price.compareTo(o2.price);
		 */

		/*//가격 int로 비교하기
		 * if(o1.price < o2.price) return -1; 
		 * else if(o1.price == o2.price) return 0;
		 * else return 1;
		 */

		// 이름으로 비교하기
		return o1.name.compareTo(o2.name);
	}

}
