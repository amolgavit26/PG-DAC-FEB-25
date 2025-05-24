package com.cdac.dao;

import com.cdac.entities.User;
import java.util.List;

public interface UserDao {
	//add a method to sign up new user
		String signUp(User user);

		Object getUserDetails(Long userId);

		List<User> getAllUsers();
}
