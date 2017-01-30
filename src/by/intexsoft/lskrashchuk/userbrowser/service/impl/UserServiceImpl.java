package by.intexsoft.lskrashchuk.userbrowser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.intexsoft.lskrashchuk.userbrowser.model.User;
import by.intexsoft.lskrashchuk.userbrowser.repository.UserRepository;
import by.intexsoft.lskrashchuk.userbrowser.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll()
	{
		return userRepository.getAll();
	}

}
