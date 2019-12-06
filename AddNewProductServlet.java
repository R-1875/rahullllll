package com.slk.training.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.training.dao.ProductManager;
import com.slk.training.entity.Product;

@WebServlet({ "/AddNewProductServlet", "/add-new-product" })
public class AddNewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/Pages/product-form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		//1:
		String input;
		Product p = new Product();
		input= request.getParameter("id");
		p.setId(Integer.parseInt(input));
		input= request.getParameter("name");
		p.setName(input);
		input=request.getParameter("category");
		p.setCategory(input);
		input=request.getParameter("price");
		p.setPrice(Double.parseDouble(input));
		
		
		//2:
		
		ProductManager pm= new ProductManager();
		pm.addNewProduct(p);
		
		//4:
		response.sendRedirect("./get-all-products");
		
	}

}
