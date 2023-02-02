package polymoEx_01;

import java.util.Scanner;

public class ScoreBusiness {
	//������ �����ϴ� Ŭ����
	
	//�ʵ� �Է� �޴� �޼ҵ�
	void input(Score score) {
		
		Scanner sc = new Scanner(System.in);
		
		//����� �Է� �κ�
		System.out.print("����� �Է� > ");
		score.setSubject(sc.next());
		sc.nextLine();
		System.out.print("�߰���� �����Է� > ");
		score.setMidExam(sc.nextInt());
		sc.nextLine();
		System.out.print("�⸻��� �����Է� > ");
		score.setFinalExam(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �����Է� > ");
		score.setPerEvalution(sc.nextInt());
		sc.nextLine();
		
		
		if (score instanceof Elementary) {
			
			scoreCal(score);
			
		} else if(score instanceof Middle) {
			
			//��米�� �ʵ�� �ڽĿ� �־ �θ� ���� ������ �� ���� ������ �ٿ�ĳ����
			Middle ms = (Middle) score;
			System.out.print("��� ���� > ");
			ms.setTeacher(sc.next());
			// ((Middle) score).setTeacher -> ��������ȯ!
			sc.nextLine();
			
			System.out.print("�⼮ ���� > ");
			ms.setAttendance(sc.nextInt());
			sc.nextLine();
			
			System.out.print("���� ���� > ");
			ms.setVolunteer(sc.nextInt());
			sc.nextLine();
			
			scoreCal(ms);//�⼮ ���� + ���� ���� �޼ҵ� �ʿ�
			
		} else if(score instanceof High) {
			High hs = (High) score;
			System.out.print("��� ���� > ");
			hs.setTeacher(sc.next());
			sc.nextLine();
			
			System.out.print("�⼮ ���� > ");
			hs.setAttendance(sc.nextInt());
			sc.nextLine();
			
			System.out.print("���� ���� > ");
			hs.setVolunteer(sc.nextInt());
			sc.nextLine();
			
			scoreCal(hs);
			
		}
		
		
		//��� �޼ҵ� ȣ��
		scoreCal(score);
		
	}
	
	//��� �޼ҵ�
	void print(Score e1) {
		e1.printAll();
	}
	
	//���� ���
	void scoreCal(Score e1) {
		if (e1 instanceof Elementary) {
			e1.setScore( e1.getMidExam() + e1.getFinalExam() + e1.getPerEvalution() );
		} else if (e1 instanceof High) {
			High hs = (High) e1;
			hs.setScore(hs.getMidExam() + hs.getFinalExam() + hs.getPerEvalution() + hs.getAttendance() + hs.getVolunteer());
			hs.setStandardDevi((hs.getScore() * 0.253));
			//High�� Middle�� �ڽ�Ŭ�����̹Ƿ� High���� ���� �����ϵ��� ������ �ٲ���� ��
		} else if (e1 instanceof Middle) {
			Middle ms = (Middle) e1;
			ms.setScore( ms.getMidExam() + ms.getFinalExam() + ms.getPerEvalution() + ms.getAttendance() + ms.getVolunteer());
		} 
		
	}

}
