package org.example.Demo;

import org.springframework.stereotype.Component;

@Component("myBean")

public class Greeting {

    public void sayhello(){
        System.out.println("hello");
    }
}
