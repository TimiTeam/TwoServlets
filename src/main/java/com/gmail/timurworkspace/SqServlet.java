package com.gmail.timurworkspace;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sq")
public class SqServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("*** The doPost methods on SqServlet ***");

        PrintWriter writer = resp.getWriter();

        int k =(Integer) req.getAttribute("k");


        writer.println("<html>" +
                "<head>" +
                "<title>Result</title>" +
                "<body>" +
                "<h2 align ='center'>Hello from SqServlet</h2>" + "<br>" +
                "<h1 align = 'center'>The sq of you numbers is: " + k + " </h1>" +
                "</body>" +
                "</head>" +
                "</html>");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("*** The doGet methods on SqServlet ***");

        PrintWriter writer = resp.getWriter();

        Cookie[] cookies = req.getCookies();

        int k =0;

        for (Cookie c: cookies){
            if (c.getName().equals("k")){
                k=Integer.parseInt(c.getValue());
            }
        }

        writer.println("<html>" +
                "<head>" +
                "<title>Result</title>" +
                "<body>" +
                "<h2 align ='center'>Hello from SqServlet</h2>"+"<br>"+
                "<h1 align = 'center'>The sq of you numbers is: "+k+" </h1>" +
                "</body>" +
                "</head>" +
                "</html>");
    }
}
