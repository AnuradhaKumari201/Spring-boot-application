/**
 * created package.
 */
package com.knoldus.Springbootassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(
				SpringBootAssignmentApplication.class, args);
	}
	protected SpringBootAssignmentApplication(){
     // created protected Constructor.
	}

}
