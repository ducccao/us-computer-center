package HCMUS.Computer.Center.Data;
import java.sql.*;
import java.util.Vector;
public class HocVienDB {
	private String Url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="hocvien";
	
	
	private Vector<String> maHocVienData=new Vector<String>(0);
	private Vector<String>  matKhauData=new Vector<String>(0);
	private Vector<String>  chucVuData=new Vector<String>(0);
	private Vector<String>  hoTenData=new Vector<String>(0);
	private Vector<String>  ngaySinhData=new Vector<String>(0);
	private Vector<String>  diaChiData=new Vector<String>(0);
	private Vector<String>  sdtData=new Vector<String>(0);
	private Vector<Vector<String>> all=new Vector<Vector<String>>(0);
	

	
	
	public HocVienDB() {
		layThongTin();
	}

	
	
	public void layThongTin() {
		try {
			Connection conn= DriverManager.getConnection(Url,username,password);
			System.out.println("Connected to Database");
			
			
			Statement stmt=conn.createStatement();
			String sql="select * from "+tblName;
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String maHocVien=rs.getString("maHocVien");
				String matKhau=rs.getString("matKhau");
				String chucVu=rs.getString("chucVu");
				String hoTen=rs.getString("hoTen");
				String ngaySinh=rs.getString("ngaySinh");
				String diaChi=rs.getString("diaChi");
				String sdt=rs.getString("sdt");
		
				
				maHocVienData.add(maHocVien);
				matKhauData.add(matKhau);
				chucVuData.add(chucVu);
				hoTenData.add(hoTen);
				ngaySinhData.add(ngaySinh);
				diaChiData.add(diaChi);
				sdtData.add(sdt);
				
			}
			
			all.add(maHocVienData);
			all.add(matKhauData);
			all.add(chucVuData);
			all.add(hoTenData);
			all.add(ngaySinhData);
			all.add(diaChiData);
			all.add(sdtData);
	
			stmt.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection to database have been errors");
			System.out.println(e);
		}
		
		
	}
	
	
	public Vector<Vector<String>>getAll(){
	
		return all;
	}
	
	
	public Vector<String> layTatCaMaHocVien() {
		
		return maHocVienData;
	}
	
	
	public Vector<String> layTatCaMatKhauHocVien() {
	
		return matKhauData;
	}
	
	public Vector<String> layTatCaChucVuHocVien() {
	
		return chucVuData;
	}
	
	public Vector<String> layTatCaHoTenHocVien() {
	
		return hoTenData;
	}
	public Vector<String> layTatCaNgaySinhHocVien() {
	
		return ngaySinhData;
	}
	
	public Vector<String> layTatCaDiaChiHocVien() {
		
		return diaChiData;
	}
	public Vector<String> layTatCaSDTHocVien() {
		
		return sdtData;
	}
	

	
}
