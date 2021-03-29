package com.knoldus.Springbootassignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class SpringBootAssignmentApplicationTests {

	@Test
	void contextLoads() {
		 ControllerClass hlwController = new ControllerClass();

		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
		String str = "Running, {" + localTime.format(dtf) + "}";
		  Assertions.assertEquals(str,hlwController.showRunning());
	}



}
