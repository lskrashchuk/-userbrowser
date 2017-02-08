package by.intexsoft.lskrashchuk.userbrowser.service;

import java.util.List;

import by.intexsoft.lskrashchuk.userbrowser.model.User;

/**
 * User service interface
 *
 */
public interface UserService
{
	List<User> findAll();
}
