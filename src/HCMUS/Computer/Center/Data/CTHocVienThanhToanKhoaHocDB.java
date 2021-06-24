package HCMUS.Computer.Center.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CTHocVienThanhToanKhoaHocDB {
	private String url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblHocVien="hocvien";
	private String tblChiTietThanhToan="chitiethocvienthanhtoankhoahoc";
	
	public void insertHocVien(String maHocVien,String matKhau,

			String chucVu,String hoTen,String ngaySinh
			,String diaChi,String sdt) {
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
			System.out.print("Connected to database");
			
			Statement stmt=conn.createStatement();
			
			String sql="insert into "+this.tblHocVien
					+" (maHocVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) "
					+" values (?,?,?,?,?,?,?)";
			
			PreparedStatement preparedStmt=conn.prepareStatement(sql);
			preparedStmt.setString(1, maHocVien);
			preparedStmt.setString(2, matKhau);
			preparedStmt.setString(3, chucVu);
			preparedStmt.setString(4, hoTen);
			preparedStmt.setString(5, ngaySinh);
			preparedStmt.setString(6, diaChi);
			preparedStmt.setString(7, sdt);
			
			preparedStmt.execute();
			
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			JFrame f=new JFrame();
			JOptionPane.showMessageDialog(f,e.getMessage());
			
			
			
			System.out.println("Connection to database have been errors");
			System.out.println(e.getMessage());
		}
	}
	
	public void insertChiTietThanhToan(String maHocVien,String maKhoaHoc,
			String maNhanVien,boolean daThanhToan) {
		try {
			Connection conn=DriverManager.getConnection(this.url,this.username,this.password);
			System.out.print("Connected to database");
			
			Statement stmt=conn.createStatement();
			
			String sql="insert into "+ this.tblChiTietThanhToan
					+ "(maHocVien,maKhoaHoc,maNhanVien,daThanhToan)"
					+ " values (?,?,?,?)";
			
			PreparedStatement pre=conn.prepareStatement(sql);
			pre.setString(1, maHocVien);
			pre.setString(2, maKhoaHoc);
			pre.setString(3, maNhanVien);
			pre.setBoolean(4, daThanhToan);
			
			pre.execute();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			JFrame f=new JFrame();
			JOptionPane.showMessageDialog(f, e.getMessage());
		}
	}
}


