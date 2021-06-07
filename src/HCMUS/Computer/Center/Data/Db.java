package HCMUS.Computer.Center.Data;
import java.sql.*;


public class Db {
	public void all() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/us-computer-center";
			Connection conn=DriverManager.getConnection(url,"root","root");
			
			Statement stmt=conn.createStatement();
			
			String sql="select * from `khoahoc` ";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString(0));
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				conn.close();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
