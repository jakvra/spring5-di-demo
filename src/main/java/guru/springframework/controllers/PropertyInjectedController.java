package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// NOT TO DO !!!!

@Controller
public class PropertyInjectedController {

    // use interface !!
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
