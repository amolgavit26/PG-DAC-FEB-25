package com.cdac.tester;
import java.sql.*;
import java.util.Scanner;

import static com.cdac.utils.DBUtils.*;

public class TestPrepareStatement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String sql = "select * from users where email = ? and password = ?";
			// open Connecton
			openConnection(); 
			Connection cn = getConnection();
			//create JDBC PreparedStateMent
			/*
			 * Connection interface method
			 * public Preparedstatement PreparedSatement(String sql)throws SQL Exception
			 */
			PreparedStatement pst = cn.prepareStatement(sql);
			// Prompt user for email and password
			System.out.println("Enter Your Email and Password");
			//set IN parameters
			/*
			 * Method of PreparedStatement
			 * public void setType(int paramPosition, Type value) throws SQL Exception
			 * Type - Generic SQL type | JDBC data type
			 */
			pst.setString(1,sc.next());	//Set email
			pst.setString(2, sc.next());	//Set Password
			
			//execute the query and get ResultSet - selected row and columns
			/*
			 * Method of PreparedStatement interface
			 * public ResultSet executeQuery() throws SQL Exception
			 */
			
			try (ResultSet rst = pst.executeQuery()) {
				//RST - Cursor - before the 1st row
				/*
				 * ResultSet Method
				 * public boolean next() throws SQL Exception
				 */
				if (rst.next()) {
					System.out.println("Login Successful - Your Details -");
					System.out.printf("ID %d Name %s %s Email %s PWD %s Dob %s Voating Status %b Role %s %n",
							rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4), 
							rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8));
				}else
					System.out.println("Invalid email or Password...!!!");
				
				}
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
