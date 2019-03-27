package br.com.gsconweb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
/**
 * 
 * @author Rafael Rocha
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@Controller
public class SpringBootConfiguration {
	/**
	 * Within the main method, we will use a Spring Boot class so that it executes all the settings 
	 * of our application and makes it available so we can access it, which will be called SpringApplication. 
	 * It will have the run method, responsible for running the application's configuration class. 
	 * @param args
	 */
	public static void main(String[] args){
	    SpringApplication.run(SpringBootConfiguration.class, args);
	}
	
}
