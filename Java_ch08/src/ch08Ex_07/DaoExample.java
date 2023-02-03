package ch08Ex_07;

public class DaoExample {
	
	//dbWork 메소드 - 인스턴스타입의 매개변수 dao를 가짐
	public static void dbWork ( DataAccessObject dao ) {
		//객체의 주소를 매개변수로 받아서 재정의된 메소드들을 호출함
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		
		//구현클래스를 객체화 -> 주소를 메소드로 보냄
		dbWork(new OracleDao());
		dbWork(new MysqlDao());

	}

}
