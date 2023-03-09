package streamEx_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// �迭
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 10), 
				new Student("�ſ��", 20), 
				new Student("���̼�", 30)
		);
		
		//��� 1)
		Stream<Student> stream = list.stream();
		//�߰�ó��(�л� ��ü�� ������ ����)
		IntStream scoreStream = stream.mapToInt(student -> student.getScore()); //10,20,30
		//����ó��
		double avg = scoreStream.average().getAsDouble();
		
		
		//��� 2)
		double avg2 = list.stream()
				.mapToInt(student->student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("�������: " + avg + ", " + avg2);
		
		//�հ赵 ���غ���!
		int sum = list.stream().mapToInt(student->student.getScore()).sum();
		System.out.println("�հ�: " + sum);
		
		//�ִ� ������ ���غ���!
		int max = list.stream().mapToInt(student->student.getScore()).max().getAsInt();
		System.out.println("�ִ� ����: " + max);
		 
	}

}
