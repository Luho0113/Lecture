package ch15Ex_07;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// 객체 생성
		BoardDao dao = new BoardDao();
		
		//메소드 호출
		List<Board> list = dao.getBoardList();
		//Board의 자료를 List에 넣고 List의 주소를 리턴
		for(Board board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
	}

}
