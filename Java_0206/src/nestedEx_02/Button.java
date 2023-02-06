package nestedEx_02;

public class Button {
	
	//���� ��ø �������̽�
	public static interface ClickListener {
		//�߻�޼ҵ�
		void onClick();
	}
	
	//�ʵ�
	private ClickListener clickListener;
	
	//setter �޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click () {
		this.clickListener.onClick();
	}
}
