package test.java;
import java.sql.DriverManager;
import java.sql.Connection; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import org.testng.annotations.Test;
public class  DatabaseTest 
	{ 
	@Test
		public static void main() throws SQLException, ClassNotFoundException {
			//Loading the required JDBC Driver class 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Creating a connection to the database 
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.10.12.167:1433;DatabaseName=aura","sa","Sam98anu*()"); 
			//Executing SQL query and fetching the result 
			Statement st = conn.createStatement(); 
			String sqlStr = "select id,status from address_status"; 
			ResultSet rs = st.executeQuery(sqlStr); 
			while (rs.next()) 
			{ System.out.println("id  : "+rs.getString("id")); 
			System.out.println("status  : "+ rs.getString("status"));
		}
	}
}