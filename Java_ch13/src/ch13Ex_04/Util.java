package ch13Ex_04;

public class Util {
	//제네릭 메소드
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		                            //Pair의 자료타입과 변수 p
		if (p.getKey() == k) { //일치하면 Pair에 저장된 값을 리턴
			return p.getValue();
		} else { //그렇지 않으면 null
			return null;
		}
	}
	
	//또는
	public static <P extends Pair<K, V>, K, V> V getValue2(P p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}
