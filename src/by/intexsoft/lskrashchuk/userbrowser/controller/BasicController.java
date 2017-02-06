package by.intexsoft.lskrashchuk.userbrowser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import by.intexsoft.lskrashchuk.userbrowser.model.User;
import by.intexsoft.lskrashchuk.userbrowser.service.UserService;

@RestController
public class BasicController
{
	@Autowired
	private UserService userService;
	
	private static Logger LOGGER = LoggerFactory.getLogger(BasicController.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() 
    {
		LOGGER.info("Start hello method");
		return "Hello, World! Меня написала Лариса";
    }

	@RequestMapping(value = "/users")
    public List<User> getAllUsers() 
    {
        return userService.findAll();
    }
}
