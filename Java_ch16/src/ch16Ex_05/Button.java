package ch16Ex_05;

public class Button {
	// ���� ��� �������̽�(�Լ��� �������̽�)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener clickListener;
	
	//�������̽��� �Ű������� ������ �޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick(); //�������̽��� �޼ҵ带 ȣ��
	}
}
