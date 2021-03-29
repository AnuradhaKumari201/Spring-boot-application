package com.knoldus.Springbootassignment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
  public final class ControllerClass {

    @GetMapping("/status")
    /**
     * method return localtime
     */
    public String showRunning() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        return "Running, {" + localTime.format(dtf) + "}";


    }




}
