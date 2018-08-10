package com.del.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Theatre")
public class Theatre {

	@Id
	private String theatre_id;
	@OneToOne()
	@JoinColumn(name="location")
	private Location location;
	private String theatre_name;
	public Theatre(String theatre_id, Location location, String theatre_name) {
		super();
		this.theatre_id = theatre_id;
		this.location = location;
		this.theatre_name = theatre_name;
	}
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Theatre [theatre_id=" + theatre_id + ", location=" + location + ", theatre_name=" + theatre_name + "]";
	}
	/**
	 * @return the theatre_id
	 */
	public String getTheatre_id() {
		return theatre_id;
	}
	/**
	 * @param theatre_id the theatre_id to set
	 */
	public void setTheatre_id(String theatre_id) {
		this.theatre_id = theatre_id;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @return the theatre_name
	 */
	public String getTheatre_name() {
		return theatre_name;
	}
	/**
	 * @param theatre_name the theatre_name to set
	 */
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}
	
	
}
