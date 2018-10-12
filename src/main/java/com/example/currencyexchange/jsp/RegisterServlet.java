package com.example.currencyexchange.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        String email = request.getParameter("email");
        Long phone = Long.valueOf(request.getParameter("phone"));

        Customer customer = new Customer(username, password, gender, email, phone);

        request.setAttribute("customer", customer);

        request.getRequestDispatcher("registerSuccess.jsp").forward(request, response);

    }
}
