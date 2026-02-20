package financial.manager.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/login")
@RestController
public class Login {
    @GetMapping
    public String hello() {
        return "Dale Baitola"; 
    }
    
}
