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
import com.del.bean.Movie;
import com.del.bean.MovieSeats;
import com.del.bean.Registration;
import com.del.bean.Seat;

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
	
	
	public void addSeat(Seat newSeat) {
		System.out.println("Reached Registration Page");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(newSeat);
		em.getTransaction().commit();
		System.out.println("new Seat saved");
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
	
	public void addMovieSeats()
	{
		System.out.println("Add Movie Seats");
		Seat seat1=new Seat("1152550252","fsd","dsf",true);
		Seat seat2=new Seat("11521555022","fsd","dsf",true);
//		addSeat(seat1);
//		addSeat(seat2);
		Movie movie=new Movie("ji45555of", "sholay");
		ArrayList<Seat> al=new ArrayList<>();
		al.add(seat1);
		al.add(seat2);
		MovieSeats m=new MovieSeats(movie, al);
		System.out.println(m);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_entity");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(movie);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("new MovieSeat saved");
	}
	
	public static void main(String[] args) {
		//testing
		MyDaoImpl test =new MyDaoImpl();
		test.addMovieSeats();
		//System.out.println("testing locations");
//		Seat seat=new Seat("1250","fsd","dsf",true);
//		test.addSeat(seat);
//		seat=new Seat("1260","fsd","dsf",true);
//		test.addSeat(seat);
//		System.out.println(test.getLocations());
//		
//		System.out.println("Get user details");
//		Registration user=test.getUserDetails(new Login("ash","ash123"));
//		System.out.println(user);
//		System.out.println("Regioster new user");
//		Registration newUser=new Registration("jay5", "jay@gmail.com", new Location("Bangaloreoo"), "Jay Shah", new Login("jay5","jay123"));
//		test.registerUser(newUser);
		System.out.println("Done");
		
	}

}
