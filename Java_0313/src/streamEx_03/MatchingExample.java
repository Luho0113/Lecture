package streamEx_03;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		// �л� ���� �Ǵ��ϱ�
		
		Student[] studentArr = { 
				new Student("ȫ�浿", 100), 
				new Student("ȫ�浿", 80), 
				new Student("ȫ�浿", 70),
				new Student("ȫ�浿", 60) };

		boolean result = Arrays.stream(studentArr).allMatch(n -> n.getScore() >= 60);
		System.out.println("��� 60���� �ѽ��ϱ�? : " + result);

		result = Arrays.stream(studentArr).anyMatch(n -> n.getScore() >= 80);
		System.out.println("80�� �̻��� �ֳ���? : " + result);

		result = Arrays.stream(studentArr).noneMatch(n -> n.getScore() >= 100);
		System.out.println("��� 100�� �̻��Դϱ�? : " + result);

	}

}
