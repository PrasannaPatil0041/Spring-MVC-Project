package com.spring.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl {

    private HibernateTemplate hibernateTemplate;

    // ✅ Setter-based injection is preferred here
    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insertUser(UserNeww user) {
        return (Integer) hibernateTemplate.save(user);
    }
}
