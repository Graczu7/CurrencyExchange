package com.example.currencyexchange.filters;

import com.example.currencyexchange.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;

        HttpSession session = httpRequest.getSession(false);

        if (session != null && session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            System.out.println("message1" + user.getUsername() + ((HttpServletRequest) req).getRequestURI());
        } else {
            System.out.println("message2");
        }
        chain.doFilter(req, resp);


    }

    public void init(FilterConfig config) throws ServletException {

    }

}