package streamEx_04;

import java.util.Arrays;

public class AggregateExmaple {

	public static void main(String[] args) {
		// ��Ʈ�� �⺻ ����

		Student[] studentArr = { 
				new Student("ȫ�浿", 100), 
				new Student("ȫ�浿", 80), 
				new Student("ȫ�浿", 70),
				new Student("ȫ�浿", 60),
				new Student("ȫ�浿", 50),
				new Student("ȫ�浿", 40)
				};
		
		//ī����
		long count = Arrays.stream(studentArr).count();
		System.out.println("�л� �� : " + count);
		
		//����
		long sum = Arrays.stream(studentArr).mapToInt(n->n.getScore()).sum();
		System.out.println("���� : " + sum);
		
		//���
		double avg = Arrays.stream(studentArr).mapToInt(n->n.getScore()).average().getAsDouble();
		System.out.println("��� : " + avg);
		
		//�ִ밪
		int max = Arrays.stream(studentArr).mapToInt(n->n.getScore()).max().getAsInt();
		System.out.println("�ִ� : " + max);
		
		//ù ��° ���
		int findFirst = Arrays.stream(studentArr).mapToInt(n->n.getScore()).findFirst().getAsInt();
		System.out.println("ó�� ���� : " + findFirst);
	}

}
