package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
class Kain implements HelloService {

    @Autowired
    private Histories history;
    private Boolean story = true;

    public void listen() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                if (story){
                    System.out.println("Would you listen my story? (y/n)");
                }

                String phrase = "";
                phrase = br.readLine();

                if (story) {
                    doYouHear(phrase);
                    story = false;
                } else {
                    System.out.println("Sorry. Say it louder, i don't hear you");
                }
                if (phrase.equalsIgnoreCase("q")
                        || phrase.equalsIgnoreCase("stop")
                        || phrase.equalsIgnoreCase("bye")) {
                    System.out.println("Goodbye, traveler!");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("World destroy. You lose!");
        }
    }


    public void sayHistory() {
        System.out.println(history);
    }

    private void doYouHear(String phrase) {
        if (phrase.equalsIgnoreCase("y")) {
            sayHistory();
        }
        if (phrase.equalsIgnoreCase("n")) {
            System.out.println("I listen you, traveler... \n");
        }
    }

    public void hello() {
        System.out.println("Greetings Traveler! \n I'am Kain");
    }
}
