package com.daisy.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }

    //Chain：链
    /*

    * */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("dofilter");
        servletRequest.setCharacterEncoding("utf-16");
        servletResponse.setCharacterEncoding("utf-16");

        System.out.println("执行前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行后");
    }
}
