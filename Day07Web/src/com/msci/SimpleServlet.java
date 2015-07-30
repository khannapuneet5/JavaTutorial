package com.msci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/simple")
public class SimpleServlet extends HttpServlet {
	
	public SimpleServlet(){
		System.out.println("*** Simple servlet object created ***");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hello " + name + " from " + this);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
