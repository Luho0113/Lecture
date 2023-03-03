package ch16Ex_05;

public class Example {

	public static void main(String[] args) {
		//매개변수가 없는 람다식 
		
		Button btnOk = new Button();
		//setClickListener의 매개변수 = ClickListener 라는 인터페이스
		//setClickListener( "익명형 구현클래스의 내용" );
		btnOk.setClickListener(()-> {System.out.println("Ok 버튼을 클릭했습니다.");});
		
		btnOk.click();

		Button btnCancel = new Button();
		btnCancel.setClickListener(()-> {System.out.println("Cancel 버튼을 클릭했습니다.");});
		btnCancel.click();
		
		/*또는
		btnOk.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");	
			}
		}); */
		
	}

}

