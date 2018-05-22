package com.org.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {
	 static Connection conn ;
		static
		{
			try {
				Class.forName(DriverConnection.DbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public  static Connection getConn()
		{
			try {
				conn = DriverManager.getConnection(DriverConnection.url, DriverConnection.username, DriverConnection.password);
				if(conn!=null)
				{
					System.out.println("Connected");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
			
		}
		
		
}
