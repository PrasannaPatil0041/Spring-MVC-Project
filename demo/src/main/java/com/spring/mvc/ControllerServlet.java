package com.spring.mvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerServlet {
       
    @RequestMapping("/home")
    //System.out.println("");
    public String home(Model model){
        //Send the Data to the view using the Model class 
        model.addAttribute("name", "Prasnna Patil");
        model.addAttribute("city", "Pune");
        List<String> friends= new ArrayList<>();
        friends.add("Juggi");
        friends.add("Aduu");
        friends.add("Lasun");
        friends.add("Loda");
        model.addAttribute("freinds",friends);
        
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/register")
     public String register(){
        return "register";
     }
    //If we use ModelAndView as data transfering process
    //We have to return the ModelAndView object
    @RequestMapping("/feedback")
    public ModelAndView help(){

        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("name", "Prasanna");
        modelAndView.addObject("Roll Number", 0041);
        LocalDateTime time= LocalDateTime.now();
 
        modelAndView.addObject("time", time);
        //Here we tell the ModelAndView to what to put in view resolvers
        modelAndView.setViewName("feedback");

        return modelAndView;
    }
}
