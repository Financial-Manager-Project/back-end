package financial.manager.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/")
@RestController
public class WelcomeController {
    @GetMapping
    public String hello() {
        return "Welcome to the Financial Manager API"; 
    }
}
