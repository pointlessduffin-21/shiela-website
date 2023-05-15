package com.yeems214.shiela.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ShielaController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/backstory")
    public String backstory() {
        return "backstory";
    }
    @RequestMapping("/links")
    public String links() {
        return "links";
    }
}