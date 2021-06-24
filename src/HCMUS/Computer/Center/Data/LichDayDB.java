package HCMUS.Computer.Center.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LichDayDB {
	private String url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="lichday";
	
	public void insert(String maLichDay,String ngayBatDau,String ngayKetThuc,
			String ngayDayTrongTuan,String gioBatDau ,String gioKetThuc,String maKhoaHoc) {
		try {
			Connection conn=DriverManager.getConnection(this.url, this.username, this.password);
			
			Statement stmt=conn.createStatement();
			
			String sql="insert into "+this.tblName
					+"(maLichDay,ngayBatDau,ngayKetThuc,ngayDayTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc)"
					+"values (?,?,?,?,?,?,?)";
			
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setString(1, maLichDay);
			pre.setString(2, ngayBatDau);
			pre.setString(3, ngayKetThuc);
			pre.setString(4, ngayDayTrongTuan);
			pre.setString(5,gioBatDau);
			pre.setString(6, gioKetThuc);
			pre.setString(7, maKhoaHoc);
			
			pre.execute();
			
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(new JFrame(),	 e.getMessage());
		}
	}
	
}
