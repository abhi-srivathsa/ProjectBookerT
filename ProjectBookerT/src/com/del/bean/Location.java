package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loc_details")
public class Location {

	@Id
	private String loc_name;

	public Location(String loc_name) {
		super();
		this.loc_name = loc_name;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [loc_name=" + loc_name + "]";
	}

	/**
	 * @return the loc_name
	 */
	public String getLoc_name() {
		return loc_name;
	}

	/**
	 * @param loc_name the loc_name to set
	 */
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	
	
}
