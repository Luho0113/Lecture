package nestedEx_02;

import java.net.InterfaceAddress;

public class ButtonExample {

	public static void main(String[] args) {
		// 버튼 객체 생성
		Button btnOk = new Button();
		
		
		//버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
				
			}
		}
		
		
		//버튼 객체에 구현 객체를 주입
		btnOk.setClickListener(new OkListener());
		
		//버튼 클릭
		btnOk.click();
		
		
		//-----------------------------
		Button btnCancle = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		//Cancel 버튼 객체에 ClickListener 구현 객체를 주입
		btnCancle.setClickListener(new CancelListener());
		
		//Cancle 버튼 클릭
		btnCancle.click();
		
		
		//-----------------------------
		//스페이스 클릭, 마우스 클릭 만들어보기
		Button space = new Button();
		
		class SpaceListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Space 버튼을 클릭했습니다.");
			}
		}
		
		space.setClickListener(new SpaceListener());
		space.click();
		
		
		
		Button mouse = new Button();
		
		class MouseListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("마우스를 클릭했습니다.");
			}
		}
		
		mouse.setClickListener(new MouseListener());
		mouse.click();
		
	

	}

}
