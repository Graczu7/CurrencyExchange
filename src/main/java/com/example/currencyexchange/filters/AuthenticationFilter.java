package com.example.currencyexchange.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(urlPatterns = "    ?    ")
public class AuthenticationFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) req;

        HttpSession httpSession = httpServletRequest.getSession(false);

        if (httpSession != null && httpSession.getAttribute("user") != null) {
            chain.doFilter(req, resp);
        } else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect("login.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }
}

