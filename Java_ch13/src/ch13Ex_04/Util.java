package ch13Ex_04;

public class Util {
	//���׸� �޼ҵ�
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		                            //Pair�� �ڷ�Ÿ�԰� ���� p
		if (p.getKey() == k) { //��ġ�ϸ� Pair�� ����� ���� ����
			return p.getValue();
		} else { //�׷��� ������ null
			return null;
		}
	}
	
	//�Ǵ�
	public static <P extends Pair<K, V>, K, V> V getValue2(P p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}
