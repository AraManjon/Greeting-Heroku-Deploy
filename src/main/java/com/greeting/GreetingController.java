package com.greeting;

import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

  private final GreetingRepository greetingRepository;

  public GreetingController(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }
  @GetMapping("/")
  String start(){
    return String.format("Start to use endpoints 💪🏼");
  }

  @GetMapping("/hello")
  String hello(@RequestParam(value = "name", defaultValue = "World")String name){
    return String.format("Hello %s!", name);
  }

  @RequestMapping(path="/greeting")
  String addGreetings(@RequestParam String message){
    greetingRepository.save(new Greeting(message));
    return message + " introduced correctly";
  }

  @GetMapping("/greetings")
  Iterable<Greeting> greetings(){
    return greetingRepository.findAll();
  }
}
