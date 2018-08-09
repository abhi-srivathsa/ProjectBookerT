package com.del.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.del.bean.Login;

@Repository("mDao")
public class MyDaoImpl implements MyDao{

	
	@Override
	public boolean checklogin(Login login) {
		System.out.println("Reached mDAO");
		boolean success = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		System.out.println("Reached with login:"+login.getLogin()+"pas:"+login.getPassword());
		Login l = em.find(Login.class, login.getLogin());
		System.out.println("l:"+l);
		if(l!=null&&l.getPassword().equals(login.getPassword()))
			success = true;
		System.out.println("success in mDAO:"+success);
		return success;
	}

}
