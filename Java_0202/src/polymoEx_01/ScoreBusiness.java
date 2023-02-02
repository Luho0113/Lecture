package polymoEx_01;

import java.util.Scanner;

public class ScoreBusiness {
	//동작을 수행하는 클래스
	
	//필드 입력 받는 메소드
	void input(Score score) {
		
		Scanner sc = new Scanner(System.in);
		
		//공통된 입력 부분
		System.out.print("과목명 입력 > ");
		score.setSubject(sc.next());
		sc.nextLine();
		System.out.print("중간고사 점수입력 > ");
		score.setMidExam(sc.nextInt());
		sc.nextLine();
		System.out.print("기말고사 점수입력 > ");
		score.setFinalExam(sc.nextInt());
		sc.nextLine();
		System.out.print("수행평가 점수입력 > ");
		score.setPerEvalution(sc.nextInt());
		sc.nextLine();
		
		
		if (score instanceof Elementary) {
			
			scoreCal(score);
			
		} else if(score instanceof Middle) {
			
			//담당교사 필드는 자식에 있어서 부모를 통해 접근할 수 없기 때문에 다운캐스팅
			Middle ms = (Middle) score;
			System.out.print("담당 교사 > ");
			ms.setTeacher(sc.next());
			// ((Middle) score).setTeacher -> 강제형변환!
			sc.nextLine();
			
			System.out.print("출석 점수 > ");
			ms.setAttendance(sc.nextInt());
			sc.nextLine();
			
			System.out.print("봉사 점수 > ");
			ms.setVolunteer(sc.nextInt());
			sc.nextLine();
			
			scoreCal(ms);//출석 점수 + 봉사 점수 메소드 필요
			
		} else if(score instanceof High) {
			High hs = (High) score;
			System.out.print("담당 교사 > ");
			hs.setTeacher(sc.next());
			sc.nextLine();
			
			System.out.print("출석 점수 > ");
			hs.setAttendance(sc.nextInt());
			sc.nextLine();
			
			System.out.print("봉사 점수 > ");
			hs.setVolunteer(sc.nextInt());
			sc.nextLine();
			
			scoreCal(hs);
			
		}
		
		
		//계산 메소드 호출
		scoreCal(score);
		
	}
	
	//출력 메소드
	void print(Score e1) {
		e1.printAll();
	}
	
	//점수 계산
	void scoreCal(Score e1) {
		if (e1 instanceof Elementary) {
			e1.setScore( e1.getMidExam() + e1.getFinalExam() + e1.getPerEvalution() );
		} else if (e1 instanceof High) {
			High hs = (High) e1;
			hs.setScore(hs.getMidExam() + hs.getFinalExam() + hs.getPerEvalution() + hs.getAttendance() + hs.getVolunteer());
			hs.setStandardDevi((hs.getScore() * 0.253));
			//High가 Middle의 자식클래스이므로 High부터 먼저 실행하도록 순서를 바꿔줘야 함
		} else if (e1 instanceof Middle) {
			Middle ms = (Middle) e1;
			ms.setScore( ms.getMidExam() + ms.getFinalExam() + ms.getPerEvalution() + ms.getAttendance() + ms.getVolunteer());
		} 
		
	}

}
