package HCMUS.Computer.Center.Logic;

import java.util.Vector;

import HCMUS.Computer.Center.Data.GiangVienDB;
import HCMUS.Computer.Center.Data.HocVienDB;
import HCMUS.Computer.Center.Data.NhanVienQuanLyDB;

public class UserController {
	// 0: HocVien
	// 1: GiangVien
	// 2: NVQL
	private Vector<Vector<String>> maNguoiDungData=new Vector<Vector<String>>(0);
	private Vector<Vector<String>> matKhauNguoiDungData=new Vector<Vector<String>>(0);
	

	
	public Vector<Vector<String>> layTatCaMaNguoiDung() {
		HocVienDB hocVienModel=new HocVienDB();
		Vector<String>allMaHocVien=hocVienModel.layTatCaMaHocVien();
		
		GiangVienDB giangVienModel = new GiangVienDB();
		Vector<String>allMaGiangVien= giangVienModel.layTatCaMaGiangVien();
		
		NhanVienQuanLyDB nhanVienModel=new NhanVienQuanLyDB();
		Vector<String>allMaNhanVien=nhanVienModel.layTatCaMaNhanVien();
		
		maNguoiDungData.add(allMaHocVien);
		maNguoiDungData.add(allMaGiangVien);
		maNguoiDungData.add(allMaNhanVien);
			
		return maNguoiDungData;
	}
	
	public Vector<Vector<String>> layTatCaMatKhauNguoiDung() {
		HocVienDB hocVienModel=new HocVienDB();
		Vector<String>allMatKhauHocVien=hocVienModel.layTatCaMatKhauHocVien();
		
		GiangVienDB giangVienModel = new GiangVienDB();
		Vector<String>allMatKhauGiangVien= giangVienModel.layTatCaMatKhauGiangVien();
		
		NhanVienQuanLyDB nhanVienModel=new NhanVienQuanLyDB();
		Vector<String>allMatKhauNhanVien=nhanVienModel.layTatCaMatKhauNhanVien();
		
		matKhauNguoiDungData.add(allMatKhauHocVien);
		matKhauNguoiDungData.add(allMatKhauGiangVien);
		matKhauNguoiDungData.add(allMatKhauNhanVien);
			
		return matKhauNguoiDungData;
	}
}
