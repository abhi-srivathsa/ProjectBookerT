package com.del.bean;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;

public class ShowTime {

	private Theatre theatre;
	private Date date;
	private Time show_time;
	private Map<Movie,List<Seat>> movies_showing;
}
