package com.gmail.timurworkspace;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("--- The doPost methods on AddServlet ---");
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));

        int k = i+j;
        k*=k;

        req.setAttribute("k",k);

        RequestDispatcher dispatcher = req.getRequestDispatcher("sq");

        dispatcher.forward(req,resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--- The doGet methods on AddServlet ---");
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));

        int k = i+j;
        k*=k;

//        req.setAttribute("k",k);
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
//        dispatcher.forward(req,resp);
        Cookie cookie = new Cookie("k",k+"");
        resp.addCookie(cookie);

        resp.sendRedirect("sq");
    }
}
