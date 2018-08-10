package com.del.service;

import java.util.List;

import com.del.bean.Login;
import com.del.bean.Registration;

public interface MyService {

	boolean checklogin(Login login);
	void registerUser(Registration user);
	Registration getUserDetails(Login login_id);
	List<String> getLocations();
}
