package com.daisy.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther Daisy
 * @date 2020/8/9 - 15:59
 */
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        String name = (String) context.getAttribute("uname");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
//        resp.getWriter().print("<h1>测试</h1>");
        System.out.println("dadada");
        resp.getWriter().print("<h1>"+name+"</h1>");
        System.out.println("dadada");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
