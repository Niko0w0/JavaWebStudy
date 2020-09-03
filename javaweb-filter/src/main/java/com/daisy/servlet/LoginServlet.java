package com.daisy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private String username;

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        username = req.getParameter("username");
        System.out.println(username);
        if(username.equals("admin")){
            req.getSession().setAttribute("USER_SESSION",req.getSession().getId());
            resp.sendRedirect("/sys/success.jsp");
        }else{
            resp.sendRedirect("/error.jsp");
        }
    }
}
