package com.likelionhw.springhw.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MynameController {
    @GetMapping("/my-name")
    public String myname(){
        return "구교현";
    }
}
