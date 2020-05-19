package com.heroku.boot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{

  private final GreetingRepository greetingRepository;

  public HelloController(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @GetMapping("/hello")
  String hello(@RequestParam(value = "name", defaultValue = "World")String name){
    return String.format("Hello %s!", name);
  }
  @GetMapping("/greetings")
  Iterable<Greeting> greetings(@RequestParam(value = "message", defaultValue = "No Message")String message){
    greetingRepository.save(new Greeting(message));
    return greetingRepository.findAll();
  }

}
