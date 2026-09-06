package com.likelionhw.springhw.Controller;

import com.likelionhw.springhw.Service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name, @RequestParam int hour) {
        return greetingService.greet(name, hour);
    }

    @GetMapping("/messages")
    public List<String> messages() {
        return greetingService.getAllMessages();
    }
    @GetMapping("/messages/count")
    public int count() {
        return greetingService.getCount();
    }
}
