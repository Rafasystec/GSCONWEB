package br.com.gsconweb.core;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@RequestMapping("/")
	@ResponseBody
	String rootApplicationPath(){
		return "Its works!";
	}
}
