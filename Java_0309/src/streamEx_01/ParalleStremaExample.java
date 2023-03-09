package streamEx_01;

import java.util.*;
import java.util.stream.Stream;

public class ParalleStremaExample {

	public static void main(String[] args) {
		// ���� ó��
		
		List<Integer> studentNum = new ArrayList<Integer>();
		studentNum.add(1);
		studentNum.add(2);
		studentNum.add(3);
		studentNum.add(4);
		studentNum.add(1);
		
		//��Ʈ�� �����
		Stream<Integer> stream = studentNum.stream();
		stream.forEach( student -> System.out.print(student + " "));
		
		//IllegalStateException : stream�� forEach�� ��� ��Ҹ� ������ ó���߱� ������ �߻��ϴ� ����
		stream = studentNum.stream(); //��Ʈ���� �� �� �� ����
		stream.forEach( student -> System.out.print(student + " "));
		System.out.println();
		
		//������(���� ó��) : ������� ��µ��� ���� 
		Stream<Integer> pStream = studentNum.parallelStream();
		pStream.forEach( pStudent -> System.out.println(pStudent + " / �̸�: " + Thread.currentThread().getName()));
		

	}

}
