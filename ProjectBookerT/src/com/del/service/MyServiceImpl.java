package com.del.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.del.bean.Login;
import com.del.bean.Registration;
import com.del.dao.MyDao;

@Service("mService")
public class MyServiceImpl implements MyService {

	@Autowired
	private MyDao mDao;
	
	
	public MyServiceImpl() {
	}
	
	@Override
	public boolean checklogin(Login login) {
		// TODO Auto-generated method stub
		return mDao.checklogin(login);
	}

	@Override
	public void registerUser(String login_id, String password, String email, String location, String name) {
		// TODO Auto-generated method stub
		Registration newUser=new Registration(login_id, email, location, name, new Login(login_id,password));
		mDao.registerUser(newUser);
	}

	@Override
	public Registration getUserDetails(String login_id) {
		// TODO Auto-generated method stub
		return mDao.getUserDetails(login_id);
	}

}
