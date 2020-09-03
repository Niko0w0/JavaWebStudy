package com.daisy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String uname = req.getParameter("username");
        String pwd = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobbies");

        //后台接收乱码问题

        System.out.println(Arrays.toString(hobbies));


        // 这里的 / 代表当前的web应用
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }
}
