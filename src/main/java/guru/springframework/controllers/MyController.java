package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("hello there!!!");
        return "hello";
    }
}
