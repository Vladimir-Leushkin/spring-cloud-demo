package ru.mos.eirc.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Value("${common.message}")
  private String message;

  @GetMapping("/greeting")
  public String getGreeting() {
    return message;
  }

}
