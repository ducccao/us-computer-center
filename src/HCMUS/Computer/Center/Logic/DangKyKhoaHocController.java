package HCMUS.Computer.Center.Logic;

import java.sql.Date;

import HCMUS.Computer.Center.Data.CTHocVienThanhToanKhoaHocDB;

public class DangKyKhoaHocController {
	private String maHocVien="";
	private String matKhau="123123";
	private String chucVu="HocVien";
	private String hoTen="";
	private String ngaySinh="";
	private String diaChi="";
	private String sdt="";
	
	private String maKhoaHoc="";
	private String maNhanVien="";
	private boolean daThanhToan=false;
			
	
	
	public void setInfo(String maHocVien,String hoTen,String ngaySinh
			,String diaChi,String sdt,String maKhoaHoc,String maNhanVien,
			boolean daThanhToan) {
		this.maHocVien=maHocVien;
		this.hoTen=hoTen;	
		this.ngaySinh=ngaySinh;	
		this.diaChi=diaChi;	
		this.sdt=sdt;	
		
		this.maKhoaHoc=maKhoaHoc;
		this.maNhanVien=maNhanVien;
		this.daThanhToan=daThanhToan;
		
		
		
	}
	

	public void insertChiTietThanhToanKhoaHoc() {
		CTHocVienThanhToanKhoaHocDB ct=new CTHocVienThanhToanKhoaHocDB();
		
		ct.insertHocVien(this.maHocVien, this.matKhau, this.chucVu, 
				this.hoTen, this.ngaySinh, this.diaChi, this.sdt);
		
		ct.insertChiTietThanhToan(this.maHocVien, this.maKhoaHoc, 
				this.maNhanVien, this.daThanhToan);
	}

}
