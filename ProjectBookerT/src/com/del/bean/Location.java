package com.del.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loc_details")
public class Location {

	@Id
	@Column(name="loc_name")
	private String location;

	public Location(String location) {
		super();
		this.location = location;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [location=" + location + "]";
	}

	
	
}
