package com.msci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/guessgame")
public class GameServlet extends HttpServlet {
	
    public GameServlet() {
    	System.out.println("Game Servlet started");
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String input = request.getParameter("Guess");
		int guessInput = Integer.parseInt(input);
		int target = (int)(Math.random()*100);
		int attempts=0;
		if (target != guessInput){
			attempts++;
			if (guessInput > target){
				out.println("Aim lower, num of attempts: " + attempts);
			}
			else if (guessInput < target){
				out.println("Aim higher, num of attempts: " + attempts);
			}
		}
		else{
			out.println("You've got it in " + attempts + " attempts!");
		}
	}
}
