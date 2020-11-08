package com.thoughtworks.capability.demospringioccontainer;

import org.graalvm.compiler.serviceprovider.IsolateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class GreetingService {
    public GreetingService() {
        System.out.println("...service");
    }
    String sayHi() {
        return "hello world";
    }
}
