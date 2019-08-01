package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class Main {
    @Autowired
    private HelloService helloService;

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringBeans.xml");
        Main main =
                context.getBean(Main.class);
        main.start(args);
    }

    private void start(String[] args) {
        helloService.hello();
        helloService.listen();
    }

}
