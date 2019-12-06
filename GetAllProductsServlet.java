package com.slk.training.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.training.dao.ProductManager;
import com.slk.training.entity.Product;

@WebServlet({ "/GetAllProductsServlet", "/get-all-products" })
public class GetAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// step 2:
		ProductManager pm = new ProductManager();
		List<Product> list = pm.getAllProduct();
		// step 3:
		request.setAttribute("products", list);
		// step 4 :
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Pages/show-products.jsp");
		rd.forward(request, response);

	}

}
