package com.spring5.Guess_the_number_spring;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring5.Guess_the_number_spring.Game.Game;
import com.spring5.Guess_the_number_spring.Game.GameImpl;
import com.spring5.Guess_the_number_spring.Numbergenerator.NumberGenerator;
import com.spring5.Guess_the_number_spring.Numbergenerator.NumberGeneratorimpl;
import com.spring5.Guess_the_number_spring.message.MessageGenerator;
import com.spring5.Guess_the_number_spring.message.MessageGeneratorImpl;

/**
 * Hello world!
 *
 */
public class App {

	private final static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		NumberGenerator ng = context.getBean("numberGenerator", NumberGeneratorimpl.class);

		int number = ng.next();// get's random number;

		BasicConfigurator.configure();

		logger.info("number={}", number);

		Game game = context.getBean("game", GameImpl.class);

		// game.reset();

		MessageGenerator msg=context.getBean("messageGenerator",MessageGeneratorImpl.class);
		
		context.close();

		// System.out.println(ng.getMaxNumber());
	}
}
