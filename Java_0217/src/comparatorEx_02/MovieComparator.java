package comparatorEx_02;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie>{
	
	@Override
	public int compare(Movie o1, Movie o2) {
		// 이름 기준 비교
		return o1.getMovieName().compareTo(o2.getMovieName());
	}

}
