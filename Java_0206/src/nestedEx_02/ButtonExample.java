package nestedEx_02;

import java.net.InterfaceAddress;

public class ButtonExample {

	public static void main(String[] args) {
		// ��ư ��ü ����
		Button btnOk = new Button();
		
		
		//��ư Ŭ�� �̺�Ʈ�� ó���� ClickListener ���� Ŭ����
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK ��ư�� Ŭ���߽��ϴ�.");
				
			}
		}
		
		
		//��ư ��ü�� ���� ��ü�� ����
		btnOk.setClickListener(new OkListener());
		
		//��ư Ŭ��
		btnOk.click();
		
		
		//-----------------------------
		Button btnCancle = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancle ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		//Cancel ��ư ��ü�� ClickListener ���� ��ü�� ����
		btnCancle.setClickListener(new CancelListener());
		
		//Cancle ��ư Ŭ��
		btnCancle.click();
		
		
		//-----------------------------
		//�����̽� Ŭ��, ���콺 Ŭ�� ������
		Button space = new Button();
		
		class SpaceListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Space ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		space.setClickListener(new SpaceListener());
		space.click();
		
		
		
		Button mouse = new Button();
		
		class MouseListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("���콺�� Ŭ���߽��ϴ�.");
			}
		}
		
		mouse.setClickListener(new MouseListener());
		mouse.click();
		
	

	}

}
