package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id 
	@GeneratedValue 
	@Column(name = "movie_id") 
	private Long movieID;
	
	@Column(name = "movie_name") 
	private String movieName;
	
	@Column(name = "release_year") 
	private String releaseYear;
	
	public Long getMovieID() {
		return movieID;
	}
	public void setMovieID(Long movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", releaseYear=" + releaseYear + "]";
	}
}
