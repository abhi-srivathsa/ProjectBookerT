package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String booking_id;
	@OneToOne()
	@JoinColumn(name="showtime_id")
	private ShowTime showTime;
	@OneToOne()
	@JoinColumn(name="login_id")
	private Registration user;
	@OneToOne()
	@JoinColumn(name="seat_id")
	private Seat seat;
}
