package com.example.demo.controller;

import com.example.demo.model.SocialMedia;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView getHomePage(){
        return new ModelAndView("home","user",new User());
    }

    @PostMapping("/users")
    public String handleForm(@ModelAttribute("user") User user){
        System.out.println(user.getSocialMedia());
        System.out.println(user.getName());
        //wsdl gidicek donen resmi ekrana basicak.bi html sayfasina git gelen resmi bas.
        return "redirect:/";
    }
}
