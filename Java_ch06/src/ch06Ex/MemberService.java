package ch06Ex;

public class MemberService {
	//id가 홍이고 password가 12345이면 true를 리턴하는 메소드
	boolean login(String id, String password) { //매개변수 id, password
		if (id.equals("hong")&&password.equals("12345")) return true;
		else return false;
	}
	
	//id님 로그아웃 되었습니다를 출력하는 메소드
	void logout (String id) { //매개변수 id
		System.out.println(id+"님 로그아웃 되었습니다.");
	}

}
