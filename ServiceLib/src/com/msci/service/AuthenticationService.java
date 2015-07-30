package com.msci.service;

import com.msci.dblogin.UserDAO;
import com.msci.domain.User;

public class AuthenticationService {
	private UserDAO userDao;
	
	public User authenticate(String user, String pass){
		userDao = new UserDAO(user, pass);
		boolean isValid = userDao.checkLogin();
		if (isValid){
			return new User(user, pass);
		}
		return null;
	}
}
