package vectorEx_01;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class StudentExample {

	public static void main(String[] args) {
		// 스레드 프로그램에서 이용되는 ArrayList와 동일한 구조의 컬렉션

		List<Student> vlist = new Vector<Student>();

		vlist.add(new Student("홍길동1", 100));
		vlist.add(new Student("홍길동2", 80));
		vlist.add(new Student("홍길동3", 90));
		vlist.add(new Student("홍길동4", 100));

		// iterator : 항목들을 하나씩 리턴해주는 반복자
		Iterator<Student> it = vlist.iterator();

		// hasNext : 리스트 안에 다음 항목이 있으면 true 리턴
		while (it.hasNext()) {
			Student st = it.next(); // next() : Student의 첫번째 인덱스의 주소 > st에 대입
			System.out.println(st);
		}
		// 첫 번째 항목을 떼어다가 주는 방식
		// 다 출력하고 나면 남아있는 항목이 없어서 또 while문을 돌릴 수 없음 (exception 발생)
		// 4개 있네 > 3개 있네 > 2개 있네 > 1개 있네 > 0개 > false!

		// 2번 인덱스 삭제하기
		System.out.println("------------------------------------");
		System.out.println("2번 인덱스 삭제");
		vlist.remove(2);

		it = vlist.iterator();
		while (it.hasNext()) {
			Student st = it.next(); // next() : Student의 첫번째 인덱스의 주소 > st에 대입
			System.out.println(st);
		}

		System.out.println("------------------------------------");
		System.out.println("isEmpty로 확인");
		boolean isE = vlist.isEmpty();
		if (isE) {
			System.out.println("아무 것도 없습니다.");
		} else {
			System.out.println("항목이 있습니다.");
		}

	}

}
