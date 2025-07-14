

<html>
    <body>
         <%@ page import="java.util.List" %>
        <!-- Below line are the jsp scriplet which is use to run the Java in HTML -->
        <% String name= (String)request.getAttribute("name");%>
        <%List<String>f=(List<String>)request.getAttribute("friends");%> 
           
        <!--It outhe the java code in jsp-->
        <h1>Hiii 
            <%=name%>
        </h1>
        <%
           for(String el:f){ %>
             <h1>
                <%=el%>
             </h1>
        <%   }
        %>

        <h1>So u are redirected to the home page </h1>
        <p>Its done using the controller and viewResolver</p>
    </body>
</html>