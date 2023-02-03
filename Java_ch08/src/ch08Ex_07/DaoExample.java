package ch08Ex_07;

public class DaoExample {
	
	//dbWork �޼ҵ� - �ν��Ͻ�Ÿ���� �Ű����� dao�� ����
	public static void dbWork ( DataAccessObject dao ) {
		//��ü�� �ּҸ� �Ű������� �޾Ƽ� �����ǵ� �޼ҵ���� ȣ����
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		
		//����Ŭ������ ��üȭ -> �ּҸ� �޼ҵ�� ����
		dbWork(new OracleDao());
		dbWork(new MysqlDao());

	}

}
