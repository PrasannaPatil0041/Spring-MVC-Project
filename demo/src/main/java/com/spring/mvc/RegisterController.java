package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/regCtr")
//Above mapping use to map the class.Its like double door security
//So if the above mapping is uncommented then to fecth the datatransfer 
//y0u have to write like  [/demo/regCtr/dataTransfer]
public class RegisterController {
    
    //Mapping use on Handler method 
    @RequestMapping("/dataTransfer")
    public String dataTransfer(){
        return "dataTranfer";
    }
}
