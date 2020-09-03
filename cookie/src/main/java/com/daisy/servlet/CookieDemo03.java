package com.daisy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

//保存用户上一次访问的事件
public class CookieDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", URLEncoder.encode("阿幡","utf-8"));

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        resp.addCookie(cookie);
        System.out.println(cookie.getValue());
        System.out.println(URLDecoder.decode(cookie.getValue(), "utf-8"));
        resp.getWriter().print(URLDecoder.decode(cookie.getValue(),"utf-8"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
