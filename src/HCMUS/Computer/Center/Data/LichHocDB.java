package HCMUS.Computer.Center.Data;

import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class LichHocDB {
	private String Url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="lichhoc";
	
	
	public String randomString(int n) {
		byte[] arr=new byte[n];
		new Random().nextBytes(arr);
		
		String ret=new String(arr);
		return ret;
	}
	
	
	public void lapLichHoc(String ngayBatDau, 
			String ngayKetThuc,String ngayHocTrongTuan,String gioBatDau
			,String gioKetThuc,String maKhoaHoc) {
			try {
				Connection conn = DriverManager.getConnection(Url,username,password);
				System.out.print("Connected to database");
				
				Statement stmt=conn.createStatement();
				
				String maLichHoc=randomString(10);
				
				String sql="insert into "+tblName
						+"  (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) "
				+"values (?,?,?,?,?,?,?)";
				
				PreparedStatement preparedStmt=conn.prepareStatement(sql);
				preparedStmt.setString(1, maLichHoc);
				preparedStmt.setString(2, ngayBatDau);
				preparedStmt.setString(3, ngayKetThuc);
				preparedStmt.setString(4, ngayHocTrongTuan);
				preparedStmt.setString(5, gioBatDau);
				preparedStmt.setString(6, gioKetThuc);
				preparedStmt.setString(7, maKhoaHoc);
				
				preparedStmt.execute();
				
				conn.close();
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Connection to database have been errors");
				System.out.println(e.getMessage());
			}
	}
	
	
}

