package com.del.dao;

import com.del.bean.Login;
import com.del.bean.Registration;

public interface MyDao {

	boolean checklogin(Login login);

	void registerUser(Registration newUser);

	Registration getUserDetails(String login_id);

}
