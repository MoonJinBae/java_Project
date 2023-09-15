package teamProject;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String movieName;
	private List<String> movieDay;
	private List<String> movieTime;
	
	
	public Movie() {}
	public Movie(String movieName, List<String> day, List<String> time) {
		this.movieName = movieName;
		this.movieDay = new ArrayList<>(day);
		this.movieTime = new ArrayList<>(time);
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<String> getMovieDay() {
		return movieDay;
	}
	public void setMovieDay(List<String> movieDay) {
		this.movieDay = movieDay;
	}
	public List<String> getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(List<String> movieTime) {
		this.movieTime = movieTime;
	}
	
}
