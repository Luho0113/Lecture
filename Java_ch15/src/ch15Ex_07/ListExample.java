package ch15Ex_07;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// ��ü ����
		BoardDao dao = new BoardDao();
		
		//�޼ҵ� ȣ��
		List<Board> list = dao.getBoardList();
		//Board�� �ڷḦ List�� �ְ� List�� �ּҸ� ����
		for(Board board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
	}

}
