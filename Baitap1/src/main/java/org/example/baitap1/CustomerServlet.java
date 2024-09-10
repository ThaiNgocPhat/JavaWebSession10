package org.example.baitap1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    static List<Customer> customers = new ArrayList<>();
    static{
        customers.add(new Customer(1, "Mai Văn Hoàn", LocalDate.of(1983, 8, 20), "Hà Nội", "https://placehold.co/50x50?text=👤"));
        customers.add(new Customer(2, "Nguyễn Văn Nam", LocalDate.of(1983, 8, 21), "Bắc Giang", "https://placehold.co/50x50?text=👤"));
        customers.add(new Customer(3, "Nguyễn Thái Hòa", LocalDate.of(1983, 8, 22), "Nam Định", "https://placehold.co/50x50?text=👤"));
        customers.add(new Customer(4, "Trần Đăng Khoa", LocalDate.of(1983, 8, 17), "Hà Tây", "https://placehold.co/50x50?text=👤"));
        customers.add(new Customer(5, "Nguyễn Đình Thi", LocalDate.of(1983, 8, 19), "Hà Nội", "https://placehold.co/50x50?text=👤"));
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("getCustomer")) {
            request.setAttribute("customers", customers);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}

