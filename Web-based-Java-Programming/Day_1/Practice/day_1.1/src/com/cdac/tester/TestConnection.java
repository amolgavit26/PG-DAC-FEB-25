package com.cdac.tester;
import java.sql.*;
//Import All static members of the BDUtils class
import static com.cdac.utils.DBUtils.*;
public class TestConnection {

	public static void main(String[] args) {
		try {
			//open Connection
			openConnection();
			//Get Connection
			Connection cn = getConnection();
			System.out.println("Coonectd to DB....."+cn);
			//Close Connection
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Over..!");
	}

}
