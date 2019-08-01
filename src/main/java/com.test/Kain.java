package com.test;

import org.springframework.stereotype.Component;

@Component
public class Kain implements HelloService {


    public void hello() {
        System.out.println("Greetings Traveler!");
    }
}
