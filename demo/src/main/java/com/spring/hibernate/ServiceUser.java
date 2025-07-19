package com.spring.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceUser {
    @Autowired
    private UserDaoImpl ud;
     
    public void Serviceinsert(UserNeww user){
         //UserDaoImpl ud= new UserDaoImpl();
         ud.insertUser(user);
    }
}
