package com.del.bean;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="showtime")
public class ShowTime {

	@Id
	private String showtime_id;
	@OneToOne
	@JoinColumn(name="theatre_id")
	private Theatre theatre;
	@Column(name="s_date")
	private Date date;
	private Time show_time;
	@OneToMany(mappedBy="msid",cascade=CascadeType.ALL)
	//@JoinColumn(name = "id")
	private List<MovieSeats> movies_showing= new ArrayList<MovieSeats>();
	
}
