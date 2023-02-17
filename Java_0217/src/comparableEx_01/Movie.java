package comparableEx_01;

public class Movie implements Comparable<Movie>{
	private String movieName;
	private Integer ticketing;
	
	@Override
	public int compareTo(Movie o) {
		return movieName.compareTo(o.movieName);
	}
	
	public Movie(String movieName, Integer ticketing) {
		this.movieName = movieName;
		this.ticketing = ticketing;
	}

	
	//게터세터
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getTicketing() {
		return ticketing;
	}

	public void setTicketing(Integer ticketing) {
		this.ticketing = ticketing;
	}
}
