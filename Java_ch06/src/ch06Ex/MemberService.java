package ch06Ex;

public class MemberService {
	//id�� ȫ�̰� password�� 12345�̸� true�� �����ϴ� �޼ҵ�
	boolean login(String id, String password) { //�Ű����� id, password
		if (id.equals("hong")&&password.equals("12345")) return true;
		else return false;
	}
	
	//id�� �α׾ƿ� �Ǿ����ϴٸ� ����ϴ� �޼ҵ�
	void logout (String id) { //�Ű����� id
		System.out.println(id+"�� �α׾ƿ� �Ǿ����ϴ�.");
	}

}
