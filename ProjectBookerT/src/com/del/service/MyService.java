package com.del.service;

import com.del.bean.Login;
import com.del.bean.Registration;

public interface MyService {

	boolean checklogin(Login login);
	void registerUser(String login_id,String password,String email,String location,String name);
	Registration getUserDetails(String login_id);
}
