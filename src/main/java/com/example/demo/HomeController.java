package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {

        model.addAttribute("myvar","greeting...");
        model.addAttribute("myvar1","...Hey everybody");
        return "myhometemp";
       }

}
