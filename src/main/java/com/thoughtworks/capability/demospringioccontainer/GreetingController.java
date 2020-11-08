package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {

    private GreetingService greetingService;

    public GreetingController() {
        this.greetingService = new GreetingService();
        System.out.println("...controller");
    }

    @GetMapping("/greet")
    public String greet() {
        this.greetingService = new GreetingService();
        return greetingService.sayHi();
    }

}
