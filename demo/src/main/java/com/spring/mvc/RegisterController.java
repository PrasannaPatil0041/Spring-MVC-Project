package com.spring.mvc;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.hibernate.ServiceUser;
import com.spring.hibernate.UserNeww;

import jakarta.servlet.http.HttpServletRequest;


//@RequestMapping("/regCtr")
//Above mapping use to map the class.Its like double door security
//So if the above mapping is uncommented then to fecth the datatransfer 
//y0u have to write like  [/demo/regCtr/dataTransfer]
@Controller
public class RegisterController {
    @Autowired
     private ServiceUser su;
    //Mapping use on Handler method 
    // @RequestMapping(path="/dataTransfer", method=RequestMethod.POST)
    // public String dataTransfer(@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("address") String address, Model model){

    //Instead of fetchng the data with the use ReqParam which is quiet long method we just use 
    //@MOdelAtribute anotatation
    //It will take the value from input and put in object user and giveit back to the Model
    //But be careful while mapping the obect teh pareameter in the obect and input id must be same
    
    //This will make all  of the model accesible to the provided attributes
    @ModelAttribute
    public void details(Model model){
         model.addAttribute("header","Check the information that u have filed in the form");
         model.addAttribute("desc","Above datil will be use for the verfication process and we believe that the information provided by u is correct" );
    }

    @RequestMapping(path="/dataTransfer", method=RequestMethod.POST)
    public String dataTransfer(HttpServletRequest req, Model model){
        //user get automatically be put in the model
        // model.addAttribute("header", "Portal Registration");
        // model.addAttribute("desc","Abovw deatils are given by the user to our portal");
        Random rand = new Random();

        //int randomInt = rand.nextInt(); // any int value
        int r1 = rand.nextInt(100000);
        UserNeww user1=new UserNeww(r1, (String)req.getParameter("name"), (String)req.getParameter("phone"),(String)req.getParameter("address"));
        model.addAttribute("user",user1);
        System.out.println(user1);
        su.Serviceinsert(user1);
        return "dataTransfer";
    }
}

//  System.out.println(name);
//          System.out.println(phone);
//          System.out.println(address);
//         //Fetching the data usin the servlet req is old method 
//         //we will use the Requestparam for the fetching 
//        // String name=req.getParameter("name");
//        // String phone=req.getParameter("phone");
//        // String email=req.getParameter("email");
//        // System.out.println(name);
//        // System.out.println(phone);
//        // System.out.println(email);

//        //Willl send the data to the dataTransfer using the model
//        long phoneNu = Long.parseLong(phone);
//        User u = new User();
//        u.setName(name);
//        u.setPhone(phoneNu);
//        u.setAddress(address);
//        model.addAttribute("user",u);