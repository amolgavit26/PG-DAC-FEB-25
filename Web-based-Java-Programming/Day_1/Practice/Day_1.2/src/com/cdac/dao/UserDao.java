package com.cdac.dao;

import java.sql.SQLException;

import com.cdac.pojos.User;

public interface UserDao {
// sign in using layer
	//  signin(email, password) throws SQL Exception
	User signIn(String email, String pwd) throws SQLException;
	
	// signUp(User newUser) throws SQLException;
	String signUp(User newUser) throws SQLException;
}

 