package HCMUS.Computer.Center.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class GiangVienDB {
	private String Url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="giangvien";
	
	
	private Vector<String> maGiangVienData=new Vector<String>(0);
	private Vector<String>  matKhauData=new Vector<String>(0);
	private Vector<String>  chucVuData=new Vector<String>(0);
	private Vector<String>  hoTenData=new Vector<String>(0);
	private Vector<String>  ngaySinhData=new Vector<String>(0);
	private Vector<String>  diaChiData=new Vector<String>(0);
	private Vector<String>  sdtData=new Vector<String>(0);
	private Vector<String>  maKhoaHocData=new Vector<String>(0);
	private Vector<Vector<String>> all=new Vector<Vector<String>>(0);
	
	public void layThongTin() {
		try {
			Connection conn= DriverManager.getConnection(Url,username,password);
			System.out.println("Connected to Database");
			
			
			Statement stmt=conn.createStatement();
			String sql="select * from "+tblName;
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String maHocVien=rs.getString("maGiangVien");
				String matKhau=rs.getString("matKhau");
				String chucVu=rs.getString("chucVu");
				String hoTen=rs.getString("hoTen");
				String ngaySinh=rs.getString("ngaySinh");
				String diaChi=rs.getString("diaChi");
				String sdt=rs.getString("sdt");
				String maKhoaHoc=rs.getString("maKhoaHoc");
		
				
				maGiangVienData.add(maHocVien);
				matKhauData.add(matKhau);
				chucVuData.add(chucVu);
				hoTenData.add(hoTen);
				ngaySinhData.add(ngaySinh);
				diaChiData.add(diaChi);
				sdtData.add(sdt);
				maKhoaHocData.add(maKhoaHoc);
				
			}
			
			all.add(maGiangVienData);
			all.add(matKhauData);
			all.add(chucVuData);
			all.add(hoTenData);
			all.add(ngaySinhData);
			all.add(diaChiData);
			all.add(sdtData);
			all.add(maKhoaHocData);
	
			stmt.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection to database have been errors");
			System.out.println(e);
		}
	}
	
	public Vector<String> layTatCaMaGiangVien() {
		layThongTin();
		return maGiangVienData;
	}
	
	
	public Vector<String> layTatCaMatKhauGiangVien() {
		layThongTin();
		return matKhauData;
	}
	
	public Vector<String> layTatCaChucVuGiangVien() {
		layThongTin();
		return chucVuData;
	}
	
	public Vector<String> layTatCaHoTenGiangVien() {
		layThongTin();
		return hoTenData;
	}
	public Vector<String> layTatCaNgaySinhGiangVien() {
		layThongTin();
		return ngaySinhData;
	}
	
	public Vector<String> layTatCaDiaChiGiangVien() {
		layThongTin();
		return diaChiData;
	}
	public Vector<String> layTatCaSDTGiangVien() {
		layThongTin();
		return ngaySinhData;
	}
	
	public Vector<String> layTatCaMaKHGiangVienGiangDay() {
		layThongTin();
		return maKhoaHocData;
	}
}
