package com.msci.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.msci.domain.User;
import com.msci.service.AuthenticationService;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private AuthenticationService authService = new AuthenticationService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		//Object obj = session.getAttribute("loginRequest");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher dispSuccess = request.getRequestDispatcher("/home.jsp");
		RequestDispatcher dispFailed = request.getRequestDispatcher("/index.jsp");
		User user = authService.authenticate(username, password);
		
		if (user != null){
			request.setAttribute("username",username);
			dispSuccess.forward(request, response);
		}
		else{
			//dispFailed.forward(request, response);
			session.invalidate();
			request.setAttribute("loginFailed", "Invalid Password");
			dispFailed.forward(request, response);
		}
	}
	
}
