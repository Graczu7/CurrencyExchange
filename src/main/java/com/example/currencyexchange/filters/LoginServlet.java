package com.example.currencyexchange.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");

        String password = request.getParameter("password");

        User user = new User(login, password);

        request.getSession(true).setAttribute("user", user);

        request.getRequestDispatcher("admin.jsp").forward(request, response);

    }
}
