package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.pojos.FlightAppUsers;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired 
	private EntityManager mgr;
	
	
	@Override
	public FlightAppUsers authenticateUser(String email, String password) {
		System.out.println("in authenticate user method");
		String jpql = "select u from FlightAppUsers u where u.email=:em and u.password=:pass";
		return mgr.createQuery(jpql, FlightAppUsers.class).setParameter("em", email).setParameter("pass", password)
				.getSingleResult();
	}


	@Override
	public void userRegister(String name, String email, String password) {
		System.out.println("in user register method");
		mgr.persist(new FlightAppUsers(name, email, password));
	}

}
