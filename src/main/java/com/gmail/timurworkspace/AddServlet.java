package com.gmail.timurworkspace;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));

        int k = i+j;
        k*=k;

        req.setAttribute("k",k);

        RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("number1"));
        int j = Integer.parseInt(req.getParameter("number2"));

        int k = i+j;
        k*=k;

        req.setAttribute("k",k);

        RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
        dispatcher.forward(req,resp);
    }
}
