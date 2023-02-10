package arrayListEx_02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		List<Board> list = new ArrayList<>();

		// 객체 추가
		// new Board로 객체를 생성하고 그 주소를 add를 통해 list에 추가함
		list.add(new Board("제목1", "내용1", "글쓴이1", "2월 10일")); // 0번
		list.add(new Board("제목2", "내용2", "글쓴이2", "2월 1일")); // 1번
		list.add(new Board("제목3", "내용3", "글쓴이3", "2월 5일")); // 2번

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println("-----------------------------");

		// 특정 필드만 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSubject());
			// list.get(i) > 주소가 출력됨
		}
		System.out.println("-----------------------------");
		System.out.println();

		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println("2번 인덱스 출력!");
		System.out.println(
				board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter() + "\t" + board.getJoindate());
		System.out.println("-----------------------------");
		System.out.println();

		// 모든 객체 가져오기
		System.out.println("모든 객체 출력!");
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);

			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t" + b.getJoindate());
		}
		System.out.println("-----------------------------");
		System.out.println();

		// 향상된 for문으로 모든 객체 하나씩 가져오기
		System.out.println("향상된 for문으로 출력하기");
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getSubject() + "\t" + b.getWriter() + "\t" + b.getJoindate());
		}
		System.out.println("-----------------------------");
		System.out.println();

		// 게시판 제목에 "제목2"라는 것을 쓴 사람의 이름과 작성일을 검색
		System.out.println("1) 제목2 작성한 사람?");
		System.out.println("작성자: " + list.get(1).getWriter() + " / 작성일: " + list.get(1).getJoindate());
		System.out.println("-----------------------------");
		System.out.println();

		// 또는
		System.out.println("2) 제목2 작성한 사람? ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSubject().equals("제목2")) {
				System.out.println(list.get(i).getWriter() + " / " + list.get(i).getJoindate());
			}
		}
		System.out.println("-----------------------------");
		System.out.println();

		// 작성일이 2월 10일인 게시글의 제목과 내용을 출력
		System.out.println("3) 2월 10일에 작성한 게시글의 제목과 내용은?");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getJoindate().contains("2월 10일")) {
				System.out.println(list.get(i).getSubject() + " / " + list.get(i).getContent());
			}
		}

	}

}
