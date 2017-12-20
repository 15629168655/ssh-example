package com.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssh.model.User;

public class UserDAO {
	private SessionFactory sessionFactory;

	public List<User> query() {
		String hql = "from User";
		return this.getSession().createQuery(hql).list();
	}

	public User getById(int id) {
		String hql = "from User u where u.uid=:id";
		return (User) this.getSession().createQuery(hql)
				.setString("id", String.valueOf(id)).uniqueResult();
	}

	public void add(User user) {
		this.getSession().save(user);
	}
	
	public void update(User user){
		this.getSession().update(user);
	}
	
	public void delete(User user){
		this.getSession().delete(user);
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
