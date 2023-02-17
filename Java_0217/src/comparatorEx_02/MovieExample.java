package comparatorEx_02;


import java.util.TreeSet;

public class MovieExample {

	public static void main(String[] args) {
		//treeset ����
		TreeSet<Movie> movieSet = new TreeSet<Movie>(new MovieComparator());
		
		movieSet.add(new Movie("�˶��", 25100));
		movieSet.add(new Movie("��������", 25100));
		movieSet.add(new Movie("�ƹ�Ÿ2", 25100));
		movieSet.add(new Movie("�ܿ�ձ�2", 25100));
		
		for(Movie m : movieSet) {
			System.out.println(m.getMovieName() + " : " + m.getTicketing());
		}

	}

}
