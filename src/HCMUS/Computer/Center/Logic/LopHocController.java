package HCMUS.Computer.Center.Logic;
import java.util.Vector;

import HCMUS.Computer.Center.Data.LopHocDB;

public class LopHocController {
	// 0: Ma lop hoc
	// 1: Ten lop hoc
	private Vector<Vector<String>>tatCaLopHoc=new Vector<Vector<String>>(0);
	
	public Vector<Vector<String>> layTatCaLopHoc() {
		LopHocDB lopHocModel=new LopHocDB();
		Vector<String>allMaLopHoc= lopHocModel.layTatCaMaLopHoc();
		Vector<String>allTenLopHoc= lopHocModel.layTatCaTenLopHoc();
		
		tatCaLopHoc.add(allMaLopHoc);
		tatCaLopHoc.add(allTenLopHoc);
		return tatCaLopHoc;
	}
}
