package com.slk.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class PrintTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int num = 123;

		String input;
		input = request.getParameter("number");
		if (input != null) {
			try {
				num = Integer.parseInt(input);
			} catch (NumberFormatException e) {

				out.printf("<p>cannot print table for give input: %s</p>", input);

			}
		}
		
		String color = "blue";
		input = request.getParameter("color");
		if(input != null){
			color=input;
		}
		out.printf("<h3> table for %d...<h3>", num);
		out.printf("<div style='color: %s; '>",color);
		for (int i = 1; i <= 20; i++) {
			out.printf("%d x %d = %d<br/>", num, i, num * i);
		}
		out.println("</div>");
		out.close();
	}

}
