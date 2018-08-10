package com.del.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="seat")
public class Seat {

	@Id
	private String seat_id;
	@Column(name="s_row")
	private String row;
	@Column(name="s_seat")
	private String seat;
	@Column(name="s_available")
	private boolean available;
	
	@ManyToOne//(mappedBy="seat_id")
	@JoinColumn(name="id_custom")
	private MovieSeats seat2;
	
	public Seat(String seat_id, String row, String seat, boolean available) {
		super();
		this.seat_id = seat_id;
		this.row = row;
		this.seat = seat;
		this.available = available;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seat [seat_id=" + seat_id + ", row=" + row + ", seat=" + seat + ", available=" + available + "]";
	}
	/**
	 * @return the seat_id
	 */
	public String getSeat_id() {
		return seat_id;
	}
	/**
	 * @param seat_id the seat_id to set
	 */
	public void setSeat_id(String seat_id) {
		this.seat_id = seat_id;
	}
	/**
	 * @return the row
	 */
	public String getRow() {
		return row;
	}
	/**
	 * @param row the row to set
	 */
	public void setRow(String row) {
		this.row = row;
	}
	/**
	 * @return the seat
	 */
	public String getSeat() {
		return seat;
	}
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}