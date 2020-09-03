package com.daisy.servlet;

import com.daisy.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-16");
        resp.setCharacterEncoding("utf-16");
        resp.setContentType("text/html;charset=utf-8");

        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");

        Person person = new Person();
        person.setName(name);
        System.out.println(person.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
