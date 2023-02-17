package comparatorEx_02;

public class Movie {
	private String movieName;
	private Integer ticketing;
	
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
