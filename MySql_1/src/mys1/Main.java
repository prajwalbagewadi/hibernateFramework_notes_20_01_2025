package mys1;

import java.lang.ClassNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException obj) {
			obj.printStackTrace();
		}
		
		try {
			//																					username password			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = con.createStatement();
			st.executeQuery("create table Dept(deptId int primary key,deptName varchar(20))");
			ResultSet rs=st.executeQuery("select * from Dept");
			while(rs.next()) {
				System.out.println("deptId="+rs.getInt(1));
				System.out.println("deptName="+rs.getString(2));
			}
			rs.close();
			st.close();
			con.close();
		}catch(SQLException obj) {
			obj.printStackTrace();
		}
		System.out.println("prog executing");	
	}
}
