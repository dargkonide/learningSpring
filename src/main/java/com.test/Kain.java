package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kain implements HelloService {

    @Autowired
    private Histories history;



    public void sayHistory(){
        System.out.println(history);
    }
    public void hello() {
        System.out.println("Greetings Traveler!");
    }
}
