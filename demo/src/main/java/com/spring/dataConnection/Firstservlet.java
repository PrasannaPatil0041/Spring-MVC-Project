package com.spring.dataConnection;

//import static jakarta.servlet.http.HttpServlet.lStrings;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet41")
public class Firstservlet extends HttpServlet   {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    System.out.println("Get running");
        // Read feedback from request
    }
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String feedback = req.getParameter("feedback");
        String rating = req.getParameter("rating");

        // Save to database or log (optional)
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/dataConnection/config.xml");

        FeedBackDaoo feedbackimpl=(FeedBackDaoo)context.getBean("feedbackdao");
        FeedBack fd=new FeedBack(1,"Very good services","5-Excellent");
        int rs = feedbackimpl.insert(fd);
        System.out.println("Prasanna Patils");
        out.println("<html><body>");
        out.println("<h2>Thank you for your feedback!</h2>");
        out.println("<p>Your feedback: " + feedback + "</p>");
        out.println("<p>Total row changes are: " + rs + "</p>");
        out.println("<p>Your rating: " + rating + "</p>");
        out.println("</body></html>");
    }
}
