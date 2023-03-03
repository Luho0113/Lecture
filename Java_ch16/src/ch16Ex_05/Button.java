package ch16Ex_05;

public class Button {
	// 정적 멤버 인터페이스(함수형 인터페이스)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener clickListener;
	
	//인터페이스를 매개변수로 가지는 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick(); //인터페이스의 메소드를 호출
	}
}
