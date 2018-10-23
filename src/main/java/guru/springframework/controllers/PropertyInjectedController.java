package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
// NOT TO DO !!!!
public class PropertyInjectedController {

    // use interface !!
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
