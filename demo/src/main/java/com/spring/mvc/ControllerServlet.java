package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerServlet {
       
    @RequestMapping("/home")
    //System.out.println("");
    public String home(){
        return "home";
    }
}
