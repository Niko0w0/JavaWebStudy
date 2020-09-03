package com.daisy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-16");
        resp.setCharacterEncoding("utf-16");

        HttpSession session = req.getSession();

        session.setAttribute("name","阿幡");
        String id = session.getId();

        //判断session是不是新创建的
        if(session.isNew()){
            resp.getWriter().write("session创建成功，ID："+id);
        }else{
            resp.getWriter().write("session已经在服务器中存在了，ID："+id);
        }

        //Session创建的时候做了什么事情
//        Cookie cookie = new Cookie("JSESSIONID", id);
//        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
