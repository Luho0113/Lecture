package comparatorEx_02;


import java.util.TreeSet;

public class MovieExample {

	public static void main(String[] args) {
		//treeset 생성
		TreeSet<Movie> movieSet = new TreeSet<Movie>(new MovieComparator());
		
		movieSet.add(new Movie("알라딘", 25100));
		movieSet.add(new Movie("극한직업", 25100));
		movieSet.add(new Movie("아바타2", 25100));
		movieSet.add(new Movie("겨울왕국2", 25100));
		
		for(Movie m : movieSet) {
			System.out.println(m.getMovieName() + " : " + m.getTicketing());
		}

	}

}
