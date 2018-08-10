package com.del.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="movieseats")
public class MovieSeats {

	@Id
	@GeneratedValue
	private long id;	
	@OneToOne()
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	@OneToMany(mappedBy="seat2",cascade=CascadeType.ALL)
	private List<Seat> movie_seats= new ArrayList<Seat>();
	
//	@ManyToOne//(mappedBy="seat_id")
//	@JoinColumn(name="showtime_id")
//	private ShowTime showtime;
	
	@ManyToOne
	@JoinColumn(name="ms_id")
	private ShowTime msid;
	
	public MovieSeats(Movie movie, List<Seat> movie_seats) {
		super();
		//this.id = id;
		this.movie = movie;
		this.movie_seats = movie_seats;
	}
	public MovieSeats() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}
	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	/**
	 * @return the movie_seats
	 */
	public List<Seat> getMovie_seats() {
		return movie_seats;
	}
	/**
	 * @param movie_seats the movie_seats to set
	 */
	public void setMovie_seats(List<Seat> movie_seats) {
		this.movie_seats = movie_seats;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MovieSeats [id=" + id + ", movie=" + movie + ", movie_seats=" + movie_seats + "]";
	}
	
	
}
