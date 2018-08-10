package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	private String movie_id;
	private String movie_name;
	public Movie(String movie_id, String movie_name) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + "]";
	}
	/**
	 * @return the movie_id
	 */
	public String getMovie_id() {
		return movie_id;
	}
	/**
	 * @param movie_id the movie_id to set
	 */
	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}
	/**
	 * @return the movie_name
	 */
	public String getMovie_name() {
		return movie_name;
	}
	/**
	 * @param movie_name the movie_name to set
	 */
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	
}
