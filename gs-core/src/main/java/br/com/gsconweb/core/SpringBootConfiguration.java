package br.com.gsconweb.core.config;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * 
 * @author Rafael Rocha
 *
 */
@SpringBootApplication
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
	
	@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    return dataSource;
	}

}
