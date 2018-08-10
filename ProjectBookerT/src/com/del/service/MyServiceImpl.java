package com.del.service;

import java.util.List;

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
	public void registerUser(Registration newUser) {
		// TODO Auto-generated method stub
		mDao.registerUser(newUser);
	}

	@Override
	public Registration getUserDetails(Login login) {
		// TODO Auto-generated method stub
		return mDao.getUserDetails(login);
	}

	@Override
	public List<String> getLocations() {
		// TODO Auto-generated method stub
		return mDao.getLocations();
	}

}
