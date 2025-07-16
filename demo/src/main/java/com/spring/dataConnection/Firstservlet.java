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

        //Setting the content type of servlet        
        resp.setContentType("text/html");

        //give a page to write ur outuput html code
        PrintWriter out = resp.getWriter();

        // Save to database or log (optional)
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/dataConnection/config.xml");

        FeedBackDaoo feedbackimpl=(FeedBackDaoo)context.getBean("feedbackdao");
        String ratingStr=req.getParameter("rating");
        String desc=req.getParameter("feedback");
        
        int id = (int)(Math.random() * 10000);
        
        FeedBack fd=new FeedBack(id,desc,ratingStr);
        int rs = feedbackimpl.insert(fd);
         out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Feedback Confirmation</title>");
        out.println("<style>");
        out.println("body { font-family: 'Segoe UI', sans-serif; background: #f2f2f2; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".container { background: #fff; padding: 30px 40px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); max-width: 500px; width: 90%; text-align: center; }");
        out.println("h2 { color: #28a745; }");
        out.println("p { font-size: 16px; margin: 10px 0; }");
        out.println(".btn { margin-top: 20px; padding: 10px 20px; background: #007bff; color: #fff; border: none; border-radius: 8px; text-decoration: none; font-size: 16px; cursor: pointer; }");
        out.println(".btn:hover { background: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Thank you for your feedback!</h2>");
        out.println("<p><strong>Your feedback:</strong> " + desc + "</p>");
        out.println("<p><strong>Your rating:</strong> " + ratingStr + "</p>");
        out.println("<p><strong>Row(s) affected in database:</strong> " + rs + "</p>");
        out.println("<a href='/demo/feedback' class='btn'>Back to Feedback Form</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
