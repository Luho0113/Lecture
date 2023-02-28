package genericEx_01;

public class GenericEx02 {

	public static void main(String[] args) {
		// 제네릭 메소드
		
		//box 객체 생성
		Box<String> box = new Box<String>();
		//T <- String
		box.setT("홍길동");
		System.out.println(box.getT());
		
		Box2<String, Integer> box2 = new Box2<String, Integer>("이순신", 100);
		System.out.println(box2.getS() + " " + box2.getT());
		
		
		Box2<Boolean, Box> box3 = new Box2<Boolean, Box>(true, new Box<String>("신검대상"));
		System.out.println((box3.getS()?"남자":"여자") + " " + box3.getT().getT());
		
		

	}
	
	public <A,B> void gM() {
		
	}

}

class Box<T> {
	private T t;
	
	public Box() { }

	public Box(T t) {
		this.t = t;
	}

	public T play() { // T타입 메소드
		return t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

class Box2<S, T> {
	private S s;
	private T t;
	
	public Box2(S s, T t) {
		super();
		this.s = s;
		this.t = t;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
