package com.msci.ex1;

import java.util.HashMap;

public class SessionPlanner {
	private HashMap<String, Integer> sessions;
	private int countOf45Min;
	private int countOf50Min;
	private int countOf60Min;
	
	public SessionPlanner(HashMap<String, Integer> sessions){
		this.sessions = sessions;
		getCountOfSessions();
	}
	
	public int getCountOf45Min() {
		return countOf45Min;
	}

	public int getCountOf50Min() {
		return countOf50Min;
	}

	public int getCountOf60Min() {
		return countOf60Min;
	}

	private void getCountOfSessions(){
		for (int value : sessions.values()) {
			if (value == 60){
				countOf60Min++;
			}
			else if (value == 50){
				countOf50Min++;
			}
			else if (value == 45){
				countOf45Min++;
			}
		}
	}
}
