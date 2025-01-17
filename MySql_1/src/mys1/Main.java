package mys1;

import java.lang.ClassNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Dept {
	int deptid;
	String dname;
	
	Dept(int id,String name){
		deptid=id;
		dname=name;
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //class loader
			//Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException obj) {
			obj.printStackTrace();
		}
		
		
		try {
			//		                                                                          username password			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement st = con.createStatement();
			//create
			String q1="create table Dept(deptId int primary key,deptName varchar(20))";
			//st.executeUpdate(q1);
			
			//insert
			Dept d1=new Dept(1,"Engg");
			Dept d2=new Dept(2,"sales");
			Dept d3=new Dept(3,"hr");
			String q2="insert into Dept(deptId,deptName) values(?,?)";
			PreparedStatement ps = con.prepareStatement(q2);
//			ps.setInt(1,d1.deptid);
//			ps.setString(2,d1.dname);
//			ps.executeUpdate();
//			ps.setInt(1,d2.deptid);
//			ps.setString(2,d2.dname);
//			ps.executeUpdate();
//			ps.setInt(1,d3.deptid);
//			ps.setString(2,d3.dname);
//			ps.executeUpdate();

			
			//update
			String q3="update dept set deptId=? where deptName=?";
			PreparedStatement ps1 = con.prepareStatement(q3);
			ps1.setInt(1, 4);
			ps1.setString(2, "Engg");
			ps1.executeUpdate();
			
			//delete 
//			String q4="delete from dept where deptName=?";
//			PreparedStatement ps2 = con.prepareStatement(q4);
//			ps2.setString(1, "Engg");
//			ps2.executeUpdate();
			
			//select 
			ResultSet rs=st.executeQuery("select * from Dept");
			while(rs.next()) {
				System.out.println("deptId="+rs.getInt(1)+" deptName="+rs.getString(2));
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
