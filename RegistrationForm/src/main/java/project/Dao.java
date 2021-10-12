package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	
	String query = "insert into employee (first_name,last_name, username, password, address, contact) "
			+ "values(?,?,?,?,?,?); ";
	
	Connection con=null;
	public Connection getConnection() throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","minhaj","minhaj");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(Member mem) throws ClassNotFoundException {
		try {
			getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, mem.getFistName());
			ps.setString(2, mem.getLastName());
			ps.setString(3, mem.getUsername());
			ps.setString(4, mem.getPassword());
			ps.setString(5, mem.getAddress());
			ps.setString(6, mem.getContact());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Registration Unsuccesfull to database";
		}
		
	return "Registration succesfull to database!!";			
	}
	
	
	
}
