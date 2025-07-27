package com.dhairyashil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "This is a SpringBoot Static Web Application deployed on container by DHAIRYASHIL DESAI");
        model.addAttribute("poemTitle", "My favourite poem is:");
        model.addAttribute("poem", "O Captain! My Captain!\nOur fearful trip is done,\nThe ship has weather’d every rack,\nThe prize we sought is won.");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
