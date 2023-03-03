package ch16Ex_05;

public class Example {

	public static void main(String[] args) {
		//�Ű������� ���� ���ٽ� 
		
		Button btnOk = new Button();
		//setClickListener�� �Ű����� = ClickListener ��� �������̽�
		//setClickListener( "�͸��� ����Ŭ������ ����" );
		btnOk.setClickListener(()-> {System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");});
		
		btnOk.click();

		Button btnCancel = new Button();
		btnCancel.setClickListener(()-> {System.out.println("Cancel ��ư�� Ŭ���߽��ϴ�.");});
		btnCancel.click();
		
		/*�Ǵ�
		btnOk.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");	
			}
		}); */
		
	}

}

