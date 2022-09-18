package org.practicaltest.question2.service;

import org.practicaltest.question2.DAO.UserDAO;
import org.practicaltest.question2.exception.PasswordFormatException;
import org.practicaltest.question2.model.User;

public class UserService {

	UserDAO userDAO=new UserDAO();

	public String setUser(User user) throws PasswordFormatException {
		// TODO Auto-generated method stub
		if(user.getPassword().length()<6) {
			throw  new PasswordFormatException("Length of password is less than 6");
		}
		return userDAO.setUser(user);
	}

	public User[] displayUserDetails() {
		// TODO Auto-generated method stub
		return userDAO.displayUserDetails();
	}

}
