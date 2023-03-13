package streamEx_04;

import java.util.Arrays;

public class AggregateExmaple {

	public static void main(String[] args) {
		// ½ºÆ®¸² ±âº» Áý°è

		Student[] studentArr = { 
				new Student("È«±æµ¿", 100), 
				new Student("È«±æµ¿", 80), 
				new Student("È«±æµ¿", 70),
				new Student("È«±æµ¿", 60),
				new Student("È«±æµ¿", 50),
				new Student("È«±æµ¿", 40)
				};
		
		//Ä«¿îÆÃ
		long count = Arrays.stream(studentArr).count();
		System.out.println("ÇÐ»ý ¼ö : " + count);
		
		//ÃÑÇÕ
		long sum = Arrays.stream(studentArr).mapToInt(n->n.getScore()).sum();
		System.out.println("ÃÑÇÕ : " + sum);
		
		//Æò±Õ
		double avg = Arrays.stream(studentArr).mapToInt(n->n.getScore()).average().getAsDouble();
		System.out.println("Æò±Õ : " + avg);
		
		//ÃÖ´ë°ª
		int max = Arrays.stream(studentArr).mapToInt(n->n.getScore()).max().getAsInt();
		System.out.println("ÃÖ´ë : " + max);
		
		//Ã¹ ¹øÂ° ¿ä¼Ò
		int findFirst = Arrays.stream(studentArr).mapToInt(n->n.getScore()).findFirst().getAsInt();
		System.out.println("Ã³À½ Á¡¼ö : " + findFirst);
	}

}
