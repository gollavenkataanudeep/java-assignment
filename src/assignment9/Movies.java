package assignment9;
import java.util.ArrayList;
import java.util.Date;
public class Movies {
	
private int movieId;
private String movieName; 
private String movieType;
private String movieLang;
private String releaseDate;
private ArrayList<String> casting;
private double rating;
private double totalBusinessDone;
public Movies(int movieId, String movieName, String movieType, String movieLang, String releaseDate,
		ArrayList<String> casting, double rating, double totalBusinessDone) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.movieType = movieType;
	this.movieLang = movieLang;
	this.releaseDate = releaseDate;
	this.casting = casting;
	this.rating = rating;
	this.totalBusinessDone = totalBusinessDone;
}
public Movies() {
	
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieType() {
	return movieType;
}
public void setMovieType(String movieType) {
	this.movieType = movieType;
}
public String getMovieLang() {
	return movieLang;
}
public void setMovieLang(String movieLang) {
	this.movieLang = movieLang;
}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}
public ArrayList<String> getCasting() {
	return casting;
}
public void setCasting(ArrayList<String> casting) {
	this.casting = casting;
}

public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public double getTotalBusinessDone() {
	return totalBusinessDone;
}
public void setTotalBusinessDone(double totalBusinessDone) {
	this.totalBusinessDone = totalBusinessDone;
}

@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieType=" + movieType + ", movieLang="
			+ movieLang + ", releaseDate=" + releaseDate + ", casting=" + casting + ", rating=" + rating
			+ ", totalBusinessDone=" + totalBusinessDone + "]";
}
		
}
