package com.codingdojod.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloHuman {
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required = false) String searchQuery) {
        return "Hello " + searchQuery;
    }
}
