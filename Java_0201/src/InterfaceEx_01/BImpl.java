package InterfaceEx_01;

public class BImpl implements B, A{
	//B, A 인터페이스의 자식 클래스
	//클래스끼리 상속받을 때는 하나의 부모만 가질 수 있지만 인터페이스는 중복해서 구현 가능함
	
	@Override
	public int b1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String b2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int a1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
