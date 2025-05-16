package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.cdac.utils.DBUtils.*;

import com.cdac.pojos.User;

public class UserDaoImpl implements UserDao {
	// Dependency - DB Connection - DBUtils

	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pst2;

	public UserDaoImpl() throws ClassNotFoundException, SQLException {
		// Establish DB cn
		openConnection();
		connection = getConnection();
		// Create PreparedStatement pst1
		String sql = "select * from users where email = ? and password = ?";
		pst1 = connection.prepareStatement(sql);

		// Create PST to insert record
		pst2 = connection.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");

		System.out.println("user dao Created");
	}

	@Override
	public User signIn(String email, String pwd) throws SQLException {
		// 1. set In parameters
		pst1.setString(1, email);
		pst1.setString(2, pwd);

		// 2. execute quey n prosess RST
		try (ResultSet rst = pst1.executeQuery()) {

			if (rst.next()) {
				// success
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),
						rst.getDate(6), rst.getBoolean(7), rst.getString(8));
			}
			return null;
		}

	}

	@Override
	public String signUp(User newUser) throws SQLException {
		// set In parameters

		pst2.setString(1, newUser.getFirstName());
		pst2.setString(2, newUser.getLastName());
		pst2.setString(3, newUser.getEmail());
		pst2.setString(4, newUser.getPassword());
		pst2.setDate(5, newUser.getDob());
		pst2.setBoolean(6, false);
		pst2.setString(7, "Voter");

		// Execute query
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "VoterRegistered...";
		return "failed to register";
	}

	// clean up - close db resource (PST, DB cn)
	public void cleanUp() throws SQLException {
		if (pst1 != null) {
			pst1.close();
			pst1 = null;
		}
		if (pst2 != null) {
			pst2.close();
			pst2 = null;
		}
		closeConnection();
	}

	public User signUp(String next, String next2) {
		// TODO Auto-generated method stub
		return null;
	}

}
