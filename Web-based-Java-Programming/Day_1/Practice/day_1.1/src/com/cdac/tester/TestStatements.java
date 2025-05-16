package com.cdac.tester;
import java.sql.*;
import static com.cdac.utils.DBUtils.*;
public class TestStatements {

	public static void main(String[] args) {
		try {
			// open Connecton
			openConnection();
			Connection cn = getConnection();
			//create JDBC StateMent
			/*
			 * Connection interface method
			 * public statement createSatement()throws SQL Exception
			 */
			Statement st = cn.createStatement();
			//execute the query and get ResultSet - selected row and columns
			/*
			 * Method of Statement interface
			 * public ResultSet executeQuery(String sql) throws SQL Exception
			 */
			try (ResultSet rst = st.executeQuery("Select * from users")) {
				//RST - Cursor - before the 1st row
				/*
				 * ResultSet Method
				 * public boolean next() throws SQL Exception
				 */
				while(rst.next())
					System.out.printf("ID %d Name %s %s Email %s PWD %s Dob %s Voating Status %b Role %s %n",
							rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4), 
							rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8));
			}
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
