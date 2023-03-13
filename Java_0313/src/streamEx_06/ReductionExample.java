package streamEx_06;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// sum()�� ������ ����� �����ϴ� reduce() �޼ҵ�
		
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 100), 
				new Student("�ſ��", 80), 
				new Student("���ڹ�", 70));
		
		//��� 1
		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		
		//��� 2
		int sum2 = list.stream().map(Student::getScore).reduce(0, (a, b) -> a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		

	}

}
