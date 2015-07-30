package com.msci.ex1;

public class Conference {
	private SessionPlanner sessionPlanner;
	
	public void setSessionPlanner(SessionPlanner sessionPlanner) {
		this.sessionPlanner = sessionPlanner;
	}

	public int getNumOf45Min(){
		return sessionPlanner.getCountOf45Min();
	}
	public int getNumOf50Min(){
		return sessionPlanner.getCountOf50Min();
	}
	public int getNumOf60Min(){
		return sessionPlanner.getCountOf60Min();
	}
}
