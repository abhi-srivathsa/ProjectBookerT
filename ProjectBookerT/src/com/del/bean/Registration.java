package com.del.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login_details")
public class Registration {

	@Id
	private String login_id;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="location")
	private Location location;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="login_id")
	private Login login;

	public Registration(String login_id, String email, Location location, String name, Login login) {
		super();
		this.login_id = login_id;
		this.email = email;
		this.location = location;
		this.name = name;
		this.login = login;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the login_id
	 */
	public String getLogin_id() {
		return login_id;
	}

	/**
	 * @param login_id the login_id to set
	 */
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Registration [login_id=" + login_id + ", email=" + email + ", location=" + location + ", name=" + name
				+ ", login=" + login + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	
}
