package genericEx_01;

public class GenericEx02 {

	public static void main(String[] args) {
		// ���׸� �޼ҵ�
		
		//box ��ü ����
		Box<String> box = new Box<String>();
		//T <- String
		box.setT("ȫ�浿");
		System.out.println(box.getT());
		
		Box2<String, Integer> box2 = new Box2<String, Integer>("�̼���", 100);
		System.out.println(box2.getS() + " " + box2.getT());
		
		
		Box2<Boolean, Box> box3 = new Box2<Boolean, Box>(true, new Box<String>("�Ű˴��"));
		System.out.println((box3.getS()?"����":"����") + " " + box3.getT().getT());
		
		

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

	public T play() { // TŸ�� �޼ҵ�
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
