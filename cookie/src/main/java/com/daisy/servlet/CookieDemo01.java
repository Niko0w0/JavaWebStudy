package com.daisy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//保存用户上一次访问的事件
public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器告诉你，你来的事件，把这个时间封装成一个信件，你下次来，我就知道你来了

        //解决中文乱码
        req.setCharacterEncoding("utf-16");
        resp.setCharacterEncoding("utf-16");

        PrintWriter out = resp.getWriter();

        //Cookie 服务器端从客户端获取即可
        Cookie[] cookies = req.getCookies();

        if(cookies != null){
            out.print("你上一次访问的时间");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastLoginTime")) {
                    //获取cookie的值
                    long lastLonginTime = Long.parseLong(cookie.getValue());
                    Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLonginTime);
                    out.print(date.toString());
                }
            }
        }else{
            out.print("这是您第一次访问本站");
        }

        //服务器客户端响应一个cookie
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");

        //cookie有效期为一天
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
