package by.intexsoft.lskrashchuk.userbrowser.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.intexsoft.lskrashchuk.userbrowser.model.User;
import by.intexsoft.lskrashchuk.userbrowser.service.impl.UserServiceImpl;

/**
 * Application class
 * @author lskra
 *
 */



public class Application
{

	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UserServiceImpl us= context.getBean(UserServiceImpl.class);
		
		for (User user : us.findAll()) 
		{
			System.out.println(user);
		}
//		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
//		System.out.println(us.findAll());
	}
	
}
