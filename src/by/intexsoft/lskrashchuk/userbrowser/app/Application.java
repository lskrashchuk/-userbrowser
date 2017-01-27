package by.intexsoft.lskrashchuk.userbrowser.app;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Application class
 * @author lskra
 *
 */
public class Application
{
	@Autowired
	private UserRepository userRepository;

	/**
	 * main method
	 * @param args
	 */
	private UserRepository userRepository;
	
	public static void main(String[] args)
	{
		System.out.println(userRepository.getAll());
	}
}
