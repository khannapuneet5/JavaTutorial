package com.msci;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuessGameServlet
 */
@WebServlet("/guessgame")
public class GuessGameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gameInProgress = request.getParameter("gameInProgress");
		if ("yes".equals(gameInProgress)){
			String targetString = request.getParameter("target");
			int target = Integer.parseInt(targetString);
			int attempts = Integer.parseInt(request.getParameter("attempts")) + 1;
			int guess = Integer.parseInt(request.getParameter("guess"));
			String message ="";
			message = check(target, guess);
			request.setAttribute("message", message);
			request.setAttribute("target", target);
			request.setAttribute("attempts", attempts);
		}
		else{
			int target = (int)(Math.random()*100);
			int guess = Integer.parseInt(request.getParameter("guess"));
			String message = "";
			message = check(target, guess);
			request.setAttribute("message", message);
			request.setAttribute("target", target);
			request.setAttribute("attempts", 1);
		}
		RequestDispatcher disp = request.getRequestDispatcher("/guessresult.jsp");
		disp.forward(request, response);
	}
   	public String check(int target, int guess){
   		String message;
		if(guess > target)
			message = "Aim Lower";
		else if(guess < target)
			message = "Aim Higher";
		else
			message = "You've got it!!!";
		return message;
   	}
}
