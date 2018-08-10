package com.del.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.del.bean.Location;
import com.del.bean.Login;
import com.del.bean.Registration;

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


	@Override
	public void registerUser(Registration newUser) {
		System.out.println("Reached Registration Page");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(newUser);
		em.getTransaction().commit();
		System.out.println("new User saved");
	}


	@Override
	public Registration getUserDetails(Login login) {
		Registration user=null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		//System.out.println("Reached with login:"+login.getLogin()+"pas:"+login.getPassword());
		user = em.find(Registration.class, login.getLogin());
		//throw No user exists exception
		return user;
	}


	@Override
	public List<String> getLocations() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		List<Location> locations = em.createQuery(
	            "SELECT p FROM Location p").getResultList();
		List<String> location_list=new ArrayList<>();
		for(Location location:locations)
		{
			location_list.add(location.getLocation());
		}
		return location_list;
	}
	
	public static void main(String[] args) {
		//testing
		MyDaoImpl test =new MyDaoImpl();
		System.out.println("testing locations");
		System.out.println(test.getLocations());
		
		System.out.println("Get user details");
		Registration user=test.getUserDetails(new Login("ash","ash123"));
		System.out.println(user);
		System.out.println("Regioster new user");
		Registration newUser=new Registration("jay", "jay@gmail.com", new Location("Mumbai"), "Jay Shah", new Login("jay","jay123"));
		test.registerUser(newUser);
		System.out.println("Done");
	}

}
