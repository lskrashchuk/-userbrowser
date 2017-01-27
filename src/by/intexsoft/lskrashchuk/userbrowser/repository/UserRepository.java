package by.intexsoft.lskrashchuk.userbrowser.repository;

import org.springframework.stereotype.Repository;

/**
 * Class for user table access
 * @author lskra
 *
 */
@Repository
public class UserRepository
{
	/**
	 * Get all users method
	 * @return all users list
	 */
	public List<User> getAll(){
		Criteria cr = getSession().createCriteria(User);
		return (List<User>) cr.list();
	}
}
