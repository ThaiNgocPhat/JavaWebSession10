package org.example.baitap3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/productList")
public class ProductListServlet extends HttpServlet {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Product 1", "https://benhvienk.vn/data/media/1601/images/16100958642348_tao-do-my-red-delicious-size-36-44.jpg", 10.99, 100));
        products.add(new Product(2, "Product 2", "https://suckhoedoisong.qltns.mediacdn.vn/324455921873985536/2021/10/14/chuoi1-16341869574602070184903.jpg", 20.99, 50));
        products.add(new Product(3, "Product 3", "https://www.hoptri.com/images/quytrinhgiaiphap/2017/ChuoiGiaNamMy/NaiChuoi.jpg", 30.99, 75));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setAttribute("products", products);
        req.getRequestDispatcher("/productList.jsp").forward(req, resp);
    }
}
