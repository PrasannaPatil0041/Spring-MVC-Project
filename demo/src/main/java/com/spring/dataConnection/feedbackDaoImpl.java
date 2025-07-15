package com.spring.dataConnection;

import org.springframework.jdbc.core.JdbcTemplate;

public class feedbackDaoImpl implements  FeedBackDaoo {
    
    private JdbcTemplate jdbcTemplate;

    public feedbackDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public feedbackDaoImpl() {
    }
    
    @Override
    public int insert(FeedBack feedback) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String query="INSERT INTO feedbacks VALUES(?,?,?)";
        System.out.println("lasunnnnn");
        int rs =jdbcTemplate.update(query, feedback.getId(),feedback.getDescription(),feedback.getRating());
        return rs;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
