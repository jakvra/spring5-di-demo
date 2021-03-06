package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
// NOT TO DO !!!!

@Controller
public class PropertyInjectedController {

    // use interface !!
    @Autowired
//    public GreetingServiceImpl greetingService;
//    public GreetingService greetingService; // failed
//    public GreetingService greetingServiceImpl; // succeed - instead of qualifier using reflection by name (shortcat for qualifier)

    @Qualifier("greetingServiceImpl") // try to comment it out (it will use @Primary bean)
    public GreetingService greetingServiceImpl; // succeed - instead of qualifier using reflection by name (shortcat for qualifier)

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
