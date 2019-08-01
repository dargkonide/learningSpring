package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");

        HelloService helloService =
                (HelloService) context.getBean(Kain.class);
        helloService.hello();
        helloService.sayHistory();

    }

}
