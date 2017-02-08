package by.intexsoft.lskrashchuk.userbrowser.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.intexsoft.lskrashchuk.userbrowser.model.User;
import by.intexsoft.lskrashchuk.userbrowser.repository.UserRepository;

/**
 * Class for user table access
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository
{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Get all users method
	 * @return all users list
	 */
	public List<User> getAll()
	{
		Transaction tx = getSession().beginTransaction(); 
		Criteria cr = getSession().createCriteria(User.class);
		List<User> result = (List<User>) cr.list();
		tx.commit();
		return result;
	}
}
