package org.example.baitap1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyen Van A", "01/01/1990", "Hanoi", "images/customer1.jpg"));
        customers.add(new Customer("Tran Thi B", "05/07/1985", "Ho Chi Minh", "images/customer2.jpg"));
        customers.add(new Customer("Le Van C", "10/12/1995", "Da Nang", "images/customer3.jpg"));

        request.setAttribute("customerList", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

