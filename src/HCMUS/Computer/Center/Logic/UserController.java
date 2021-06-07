package HCMUS.Computer.Center.Logic;

import java.util.Vector;

import HCMUS.Computer.Center.Data.HocVienDB;

public class UserController {
	public Vector<String> layTatCaMaNguoiDung() {
		HocVienDB hocvienModel=new HocVienDB();
		Vector<String>allMaHocVien=hocvienModel.layTatCaMaHocVien();
		
		return allMaHocVien;
	}
}
