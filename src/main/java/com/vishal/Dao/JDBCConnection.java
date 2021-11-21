package com.vishal.Dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
		System.out.println(con);
		Statement st = (Statement) con.createStatement();
		String s="userdb";
		String query = "select * from '"+s+"'";
		 ResultSet rs= st.executeQuery(query);
		 while(rs.next())
		 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(5));
		st.close();
		con.close();

	}

}
