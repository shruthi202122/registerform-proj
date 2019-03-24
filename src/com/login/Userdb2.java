package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Userdb2 {
	public int getUserDetails(String uname1) {
		
		Connection con=null;
		List<User> li = null;
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/shruthidb","shruthi","abc");
			PreparedStatement ps=con.prepareStatement("select uname from emp where uname=?");
			ps.setString(1,uname1);
			ResultSet rs=ps.executeQuery();
			li=new ArrayList<>();
			if(rs.next()) {
				System.out.println("user existed in db");
			    i=1;
			}
			else {
				System.out.println("new user");
				 i=0;
				 return i;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		finally{ 
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	return i;
	}		
}
