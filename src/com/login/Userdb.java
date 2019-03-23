package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Userdb {

	public List<User> getUserDetails(String uname1,String pwd1) {
		Connection con=null;
		List<User> li = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/shruthidb","shruthi","abc");
			PreparedStatement ps=con.prepareStatement("select uname,pwd from emp where uname=? and pwd=?");
			ps.setString(1,uname1);
			ps.setString(2,pwd1);
			ResultSet rs=ps.executeQuery();
			li=new ArrayList<>();
			if(rs.next()) {
				System.out.println("user existed in db");
				User u=new User();
				u.setUname(rs.getString(1));
				u.setPwd(rs.getString(2));
				li.add(u);
				
			}
			else {
				System.out.println("user not exsited in db");
				return null;
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
		return li;
	}
}


