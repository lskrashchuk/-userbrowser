package by.intexsoft.lskrashchuk.userbrowser.repository;

import java.util.List;

import by.intexsoft.lskrashchuk.userbrowser.model.User;

/**
 * User repository interface
 *
 */
public interface UserRepository
{
	List<User> getAll();
}
