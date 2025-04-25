package se.dzmitry.javawebdemo.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se.dzmitry.javawebdemo.models.HockeyPlayerRepository;

@Controller
public class HomeController {
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("players", hockeyPlayerRepository.findAll());
        model.addAttribute("user", "Stefan");

     return "home";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

}
