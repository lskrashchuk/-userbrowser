package by.intexsoft.lskrashchuk.userbrowser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * User model class
 * 
 * @author lskra
 *
 */
@Entity
@Table(name = "`users`")
public class User extends AbstractPersistable<Integer>
{
	/**
	 * User name property
	 */
	@Column(name = "name")
	public String name;

	/**
	 * Method for user print
	 */
	@Override
	public String toString()
	{
		return "User: " + name;
	}

}
