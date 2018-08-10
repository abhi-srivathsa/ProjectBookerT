package com.del.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
@Scope("session")
@Entity
@Table(name="login")
public class Login {
	@Id
	private String login_id;
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String login, String password) {
		super();
		this.login_id = login;
		this.password = password;
	}
	public String getLogin() {
		return login_id;
	}
	public void setLogin(String login) {
		this.login_id = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [login=" + login_id + ", password=" + password + "]";
	}
	
	
}
